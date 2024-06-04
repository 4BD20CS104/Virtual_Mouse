#include<stdio.h>
#include<stdlib.h>

typedef struct StudentRecord
{
        char USN[20];
        char name[20];
        char dept[20];
        char phone[20];
        }Record;
        
typedef struct Node *ListPointer;
typedef struct Node 
{
Record data;
ListPointer link;
}Node;

ListPointer head;
int tRecords;
Record getNextRecord(void)
{
       Record data;
       scanf("%s",data.USN);
       scanf("%s",data.name);
       scanf("%s",data.dept);
       scanf("%s",data.phone);
       return data;
       }
       ListPointer getNode(Record data)
       {
       ListPointer temp;
       temp=(ListPointer)malloc(sizeof(*temp));
       if(temp==NULL)
       {
       printf("\nAllocation Failed\n");
       getchar();
       exit(EXIT_FAILURE);
       }else
       {
            temp->data=data;
            temp->link=NULL;
            }
            return temp;
            }
            void insert(ListPointer targetNode,ListPointer newNode)
            {
                 newNode->link=targetNode->link;
                 targetNode->link=newNode;
                 tRecords=tRecords+1;
                 }
                 void dDelete(ListPointer head,ListPointer trail,ListPointer x)
                 {
                      if(trail)
                      {
                      trail->link=x->link;
                      }else
                      {
                      head->link=x->link;
                      }
                      free(x);
                      tRecords=tRecords-1;
                      }
                      void getLastAndPrevNode(ListPointer head,ListPointer *prev,ListPointer *last)
                      {
                           ListPointer cur,trail;
                           cur=trail=head;
                           if(head->link!=NULL)
                           {
                           cur=head->link;
                           trail=NULL;
                           while(cur->link!=NULL)
                           {
                           trail=cur;
                           cur=cur->link;
                           }
                           }
                           *prev=trail;
                           *last=cur;
                           }
                           void addFront(ListPointer head,Record data)
                           {
                                ListPointer temp;
                                temp=getNode(data);
                                insert(head,temp);
                                }
                                void addRear(ListPointer head,Record data)
                                {
                                     ListPointer prev,last,temp;
                                     temp=getNode(data);
                                     getLastAndPrevNode(head,&prev,&last);
                                     insert(last,temp);
                                     }
void display(ListPointer node,int tRecords)
{
     int i;
     printf("\nUSn\tNAME\tDEPT\tPHONE\n");
     for(i=0;i<tRecords;++i)
     {
     printf("\n%s",node->data.USN);
      printf("\t%s",node->data.name);
       printf("\t%s",node->data.dept);
        printf("\t%s\n",node->data.phone);
       node=node->link;
       }
       }
       void deleteFront(ListPointer head)
       {
            ListPointer node;
            node=head->link;
            printf("\nDeleted Record:%s\n",node->data.USN);
            display(node,1);
            dDelete(head,NULL,node);
            }
            void deleteRear(ListPointer head)
            {
                 ListPointer prev,last;
                 getLastAndPrevNode(head,&prev,&last);
                 printf("\nDeleted Record:%s\n",last->data.USN);
                 display(last,1);
                 dDelete(head,prev,last);
                 }
                 int main(void)
                 {
                  Record data;
                  int nRecords;
                  int choice;
                  int i;
                  printf("\n..SINGLY LINKED LIST DEMONSTRATION..\n");
                    printf("\n\n1.N front Insertion\n\n2.Display\n");
                    printf("\n3.Front Insertion\n\n4.Delete Front\n");
                      printf("\n5.Rear Insertion\n\n6.Delete Rear\n");
                        printf("\n7.Exit\n");
                        head=getNode(data);
                        while(1)
                        {
                                printf("\nChoice: ");
                                scanf("%d",&choice);
                                switch(choice)
                                {
                        case 1:printf("\n..*FRONT INSERTION..\n");
                        printf("\nHow many STD's: ");
                        scanf("%d",&nRecords);
                        printf("\nGive %d record detail one by one\n",nRecords);
                          printf("\nUSN\tNAME\tDEPT>\tPHONE\n");
                          for(i=0;i<nRecords;++i)
                          {
                          data=getNextRecord();
                          addFront(head,data);
                          }
                          break;
                          case 2:if(tRecords==0)
                          {
                               printf("\nEmpty List\n");
                               }
                               else
                               {
                                   printf("\n..Student's details..\n");
                                   display(head->link,tRecords);
                                   printf("\nNo.of STD's:%d\n",tRecords);
                                   }
                                   break;
                    case 3:  printf("\n..SINGLE FRONT INSERTION..\n");
                    printf("\nGive record details..\n");
                      printf("\nUSN\tNAME\tDEPT.\tPHONE\n");
                      data=getNextRecord();
                      addFront(head,data);
                      break;
                      case 4:if(tRecords==0)
                      {
                           printf("\nEmpty list\n");
                           }
                           else
                           {
                               printf("\n..SINGLE FRONT DELETION..\n");
                               deleteFront(head);
                               }
                               break;
                      case 5:  printf("\n..SINGLE BACK INSERTION..\n");
                        printf("\nGive record details..\n");
                        printf("\nUSN\tNAME\tDEPT.\tPHONE\n");
                        data=getNextRecord();
                        addRear(head,data);
                        break;
                        case 6:if(tRecords==0)
      {
                          printf("\nEmpty list\n");
                          }
                          else
                          {
                              printf("\n..SINGLE BACK DELETION..\n");
                              deleteRear(head);
                              }
                              break;
                          case 7:return 0;
                          default:printf("\nWrong Choice\n");
                          }
                          }
                          }
                          
