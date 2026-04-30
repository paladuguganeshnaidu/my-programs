#include<stdio.h>
#include<stdlib.h>
int main(){
	int v,e;
	scanf("%d%d",&v,&e);
	int **adjmat,i;
	adjmat=(int**)malloc(v*sizeof(int **));
	for(i=1;i<v;i++){
		adjmat[i]=(int*)malloc(v*sizeof(int*));	
	}
	int x,y,w;
	for(i=0;i<=e;i++){
		scanf("%d%d%d",&x,&y,&w);
		adjmat[x][y]=w
		adjmat[y][x]=w
	}
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			if(i!=j&&adjmat[i][j]==0){
				adjmat[i][j]=max
			}
		}
	}
	
	return 0;
}
