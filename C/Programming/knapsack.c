#include <stdio.h>

int subset[100];
int n, arr[100];   

void print_subset(int ss) {
	int i;
    for (i = 0; i < ss; i++) {
        printf("%d ", subset[i]);
    }
    printf("\n");
}

void subsetsum(int ind, int ts, int cs, int ss) {
    if (cs == ts) {  
        print_subset(ss);
        return;
    }
    if (ind == n || cs > ts) {   
        return;
    }

    subset[ss] = arr[ind];
    subsetsum(ind + 1, ts, cs + arr[ind], ss + 1);  

    subsetsum(ind + 1, ts, cs, ss); 
}

int main() {
    scanf("%d", &n);  
    int i;
    for (i = 0; i < n; i++) { 
        scanf("%d", &arr[i]);    
    }
    int ts;
    scanf("%d", &ts);
    int cs = 0, ind = 0;
    subsetsum(ind, ts, cs, cs);

    return 0;
}
