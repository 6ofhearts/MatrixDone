public class Matrix {
    public int Size;
    public int[][] Arr;
    public int Determinant;

    public Matrix (int size){
        this.Size = size;
        this.Arr = new int[this.Size][this.Size];
    }

    public int determinant(int A[][]) {
        int n = A.length;
        if (n == 1) return A[0][0];
        int ans = 0;
        int B[][] = new int[n - 1][n - 1];
        int l = 1;
        for (int i = 0; i < n; ++i) {

            int x = 0, y = 0;
            for (int j = 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if (i == k) continue;
                    B[x][y] = A[j][k];
                    ++y;
                    if (y == n - 1) {
                        y = 0;
                        ++x;
                    }
                }
            }
            ans += l * A[0][i] * determinant(B);
            l *= (-1);
        }
        return ans;
    }

    public int getElement (int n, int m){

        return this.Arr[n][m];
    }

    public void setElement(int n, int m, int Value)
    {

        this.Arr[n][m] = Value;
    }

    public int getSize() {

        return (Size);
    }

    public void getSizeV2(){
        int SizeV2 = 0;
        for(int i = 0; i < Arr[0].length; i++){
            SizeV2++;
        }
        System.out.println(SizeV2);

    }

    public void fillRandom()
    {

        for(int i = 0; i < this.Size; i++)
        {
            for(int j = 0; j < this.Size; j++)
            {
                this.Arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void showMatrix()
    {
        for(int i = 0; i < this.Size; i++)
        {
            for(int j = 0; j < this.Size; j++)
            {
                System.out.print(this.Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}


