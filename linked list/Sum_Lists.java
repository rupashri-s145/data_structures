class node:
  def __init__(self,d):
    self.data=d
    self.next=None
class linklist:
  sum=0
  def __init__(self):
    self.head=None

  def push(self,d):
    new=node(d)
    if self.head==None:
      self.head=new
      self.sum+=self.head.data
    else:
      #new=node(d)
      temp=self.head
      while temp.next:
        temp=temp.next
      self.sum+=temp.data
      temp.next=new
      

  def print(self,head):
    temp=head
    while temp:
      print(temp.data)
      temp=temp.next
  
  def add_list(self):
    fast=self.head
    slow=fast
    while fast.next and fast.next.next:
      fast=fast.next.next
      pre=slow
      slow=slow.next
    print("mid element:",slow.data)
    pre.next=pre.next.next

l=linklist()
len=int(input("enter the list size:"))
#k=int(input("enter k from last:"))
for i in range(len):
  l.push(int(input()))
print("original list:")
l.print(l.head)
print("sum of list:",l.sum)
#l.add_list()
#l.print(l.head)