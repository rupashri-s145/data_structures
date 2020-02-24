class node:
  def __init__(self,d):
    self.data=d
    self.next=None
class linklist:
  def __init__(self):
    self.head=None

  def push(self,d):
    new=node(d)
    if self.head==None:
      self.head=new
    else:
      #new=node(d)
      temp=self.head
      while temp.next:
        temp=temp.next
      temp.next=new

  def print(self,head):
    temp=head
    l=[]
    while temp:
      l.append(temp.data)
      temp=temp.next
    print(*l)

  def del_mid(self):
    fast=self.head.next
    slow=self.head
    
    while fast and fast.next:
      pre=slow
      slow=slow.next
      fast=fast.next.next
    pre.next=pre.next.next
    return self.head
   
    

    
l=linklist()
len=int(input("enter the list size:"))
list=[int(x) for x in input().split()]
#k=int(input("enter k from last:"))
for i in range(len):
  l.push(list[i])
re=l.del_mid()
print("List after removing middle element: ")
l.print(re)
