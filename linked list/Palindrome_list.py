class node:
  def __init__(self,d):
    self.data=d
    self.next=None
class link_list:
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
  def rev(self):
    cur=self.head
    nxt=cur.next
    rev=None
    while nxt:
      if rev==None:
        rev=cur
        rev.next=None
      else:
        cur.next=rev
        rev=cur
      cur=nxt
      nxt=nxt.next
    cur.next=rev
    rev=cur
    return rev
  
  def check_palin(self,rev):
    temp=self.head
    flag=0
    while temp:
      if rev.data!=temp.data:
        print("list is not palindrome ")
        flag=1
        return 
      temp=temp.next
      rev=rev.next
    if flag==0:
      print("Yes,list is palindrome ")
    
l=link_list()
len=int(input())
#k=int(input("enter k from last:"))
string=input()
for i in string:
  l.push(i)
print("original list:")
l.print(l.head)
re=l.rev()
print("rev list")
l.print(re)
l.check_palin(re)
#l.print(l.head)