class One_away:
  def get_str(self):
    self.string1=input("Enter the string 1:")
    self.string2=input("Enter the string 2:")
  def find_oneaway(self):
    str_len1=len(self.string1)
    str_len2=len(self.string2)
    i=0
    j=0
    count=0
    if abs(str_len1-str_len2)>1:
      return False
    while i<str_len1 and j<str_len2:
      if self.string1[i]!=self.string2[j]:
        if count==1:
          return False
        if str_len1>str_len2:
          i+=1
        elif str_len1<str_len2:
          j+=1
        else:
          i+=1
          j+=1
        count+=1
      else:
        j+=1
        i+=1
    if i<str_len1 or j<str_len2:
      count+=1

    return count==1
an=One_away()
an.get_str()
if an.find_oneaway():
  print("yes")
else:
  print("no")

