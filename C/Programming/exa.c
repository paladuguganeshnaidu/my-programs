#include <stdio.h>
#define MAX 100
int heap[MAX];
int size = 0,i;
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
void insert(int value) {
    size++;
    int i = size;
    heap[i] = value;
    while (i > 1 && heap[i] < heap[i / 2]) {
        swap(&heap[i], &heap[i / 2]);
        i = i / 2;
    }
}
int deleteMin() {
    if (size == 0) {
        printf("Heap is empty\n");
        return -1;
    }
    int min = heap[1];
    heap[1] = heap[size];
    size--;
    int i = 1;
    while (2 * i <= size) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int smallest = left;
        if (right <= size && heap[right] < heap[left]) {
            smallest = right;
        }
        if (heap[i] > heap[smallest]) {
            swap(&heap[i], &heap[smallest]);
            i = smallest;
        } else {
            break;
        }
    }
    return min;
}
	void display() {
    printf("Min Heap: ");
    
    for (i = 1; i <= size; i++) {
        printf("%d ", heap[i]);
    }
    printf("\n");
}
int main() {
    insert(20);
    insert(10);
    insert(30);
    insert(5);
    insert(15);
    display();
    printf("Deleted Min: %d\n", deleteMin());
    display();
    return 0;
}




