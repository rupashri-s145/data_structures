class node:
  def __init__(self,value):
    self.data=value
    self.next=None
class linklist:
  def __init__(self):
    self.head=None
  
  def insertdata(self,value):
    new_node=node(value)
    if self.head==None:
      self.head=new_node
    else:
      temp=self.head
      while temp.next:
        temp=temp.next
      temp.next=new_node
      

  def removeduplicate(self):
    ptr1=self.head
    ptr2=None
    if ptr1==None:
      return ptr1
    else:
      while ptr1 and ptr1.next:
        ptr2=ptr1
        while ptr2.next:
          if ptr1.data==ptr2.next.data:
            ptr2.next=ptr2.next.next
          else:
            ptr2=ptr2.next
        ptr1=ptr1.next
      #print(temp.data)
      return self.head
 
  def printlist(self,h):
    temp=h
    l=[]
    while temp:
      l.append(temp.data)
      temp=temp.next
    print(*l)

ll=linklist()
n=int(input("Enter the size of list: "))
list=[int(x) for x in input().split()]
for i in range(n):
  ll.insertdata(list[i])
#ll.printlist(ll.head)
removedlist=ll.removeduplicate()
print("list After removing:")
ll.printlist(removedlist)

