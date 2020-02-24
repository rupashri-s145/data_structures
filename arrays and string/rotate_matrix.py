class matrix_rotate:
  def get_matrix(self):
    self.row_col=int(input("enter the matrixrix size(n*n): "))
    matrix=[[int(input()) for x in range(self.row_col)] for y in range(self.row_col)]
    return matrix

  def transpose(self,matrix):
    for i in range(self.row_col):
      for j in range(i+1,self.row_col):
        matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
    return matrix
    #print(matrix1[i][j])

  def rotate(self,matrix):
    matrix1=self.transpose(matrix)
    for i in range(self.row_col):
      for j in range(self.row_col//2):
        matrix1[i][j],matrix1[i][self.row_col-j-1]=matrix1[i][self.row_col-j-1],matrix1[i][j]
    return matrix1

  def print_matrix(self,matrix):
    for i in range(self.row_col):
      print(*matrix[i])
rm=matrix_rotate()
matrix=rm.get_matrix()
matrix1=rm.rotate(matrix)
print("rotated matrixrix:")
rm.print_matrix(matrix1)