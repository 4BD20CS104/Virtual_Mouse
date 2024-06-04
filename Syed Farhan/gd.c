#include<stdio.h>
#include<stdlib.h>
int adj[50][50];
int n;
int visited[50]={0};

int max=50;
int count=0;

void createMatrix(void)
{
     int i,j;
     printf("\n\nEnter the adjacency matrix\n\n");
     for(i=1;i<=n;++i)
     for(j=1;j<=n;++j)
     scanf("%d",&adj[i][j]);
     }
     void displayMatrix(void)
     {
          int i,j;
          printf("\n\nAdjacency matrix\n\n\n");
          for(i=1;i<=n;++i)
          {
          for(j=1;j<=n;++j)
          printf("%d\t",adj[i][j]);
          printf("\n\n");
          }
          }
          void dfs(int v)
          {
               int w;
               count=count+1;
               visited[v]=count;
               printf("%-4d",v);
               for(w=1;w<=n;++w)
               {
               if(adj[v][w]&&!visited[w])
               {
                                         dfs(w);
                                         }
                                         }
                                         }
                                         int main(void)
                                         {
            int ch;
            int i;
            int sVertex;
                system("cls");
                printf("\n\n\t\t\t\tGRAPH DEMONSTRATION\n\n");
                printf("\n\n\t\t1.Create Matrix\t\t2.Display matrix\n\n");
                printf("\n\n\t\t3.DFS\t\t4.Exit\n\n");
             do{
                printf("\n\nEnter your choice:?\b");
                scanf("%d",&ch);
                switch(ch)
                {
                          case 1:printf("\n\nEnter No. of Vertex:?\b");
                                 scanf("%d",&n);
                                 createMatrix();
                                 break;
                          case 2:displayMatrix();
                                 break;
                          case 3:printf("\n\nEnter the Source Vertex:?\b");
                          scanf("%d",&sVertex);
                          for(i=1;i<=n;++i)visited[i]=0;
                          count=0;
                          dfs(sVertex);
                          break;
                          case 4:return 0;
                          default:printf("\n\nInvalid Option\n\n");
                          }
                          fflush(stdin);
                          getchar();
                          }while(1);
                          }                                 
