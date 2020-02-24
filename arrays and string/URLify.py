class URLify:
  def get_str(self):
    self.str=input().strip()
  def replace(self):
    self.str=list(self.str)
    for i in range(len(self.str)):
      if self.str[i]==" ":
        self.str[i]="%20"
  def print(self):
    print(*self.str,sep="")
    
#str_space=input()
url=URLify()
url.get_str()
url.replace()
url.print()