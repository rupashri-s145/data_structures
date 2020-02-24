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

  def ele_kth(self,k):
    fast=self.head
    slow=self.head
    c=1
    len=0
    temp=self.head
    while temp:
      temp=temp.next
      len+=1
    if len>k:
      while c<k:
        c+=1
        fast=fast.next
      while fast.next and fast:
        pre=slow  
        fast=fast.next
        slow=slow.next
      pre.next=pre.next.next
      self.print(self.head)
    
    
    #print("kth element:",slow.data)
   
l=linklist()
len=int(input("enter the list size:"))
k=int(input("enter k from last:"))
for i in range(len):
  l.push(int(input()))
#l.print(l.head)
print("List After removeing kth element: ")
l.ele_kth(k)