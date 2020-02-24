class Is_unique:
  def __init__(self):
    self.string_unique=""
  def get_string(self):
    self.string=input("enter the string:")

  def find_char(self):
    char_dic=[]
    for i in self.string:
      if i not in char_dic:
        char_dic.append(i)
      else:
        print("no unique char")
        return
    print("is unique")
un=Is_unique()
un.get_string()
un.find_char()
