public class Main {

    public static void main(String[] args) {
        Matrix FirstMatrix = new Matrix(3);
        FirstMatrix.fillRandom();
        FirstMatrix.setElement(1,2,10);
        FirstMatrix.showMatrix();
        System.out.println(FirstMatrix.getElement(1, 2));
        System.out.println(FirstMatrix.getSize());
        FirstMatrix.getSizeV2();
        System.out.println(FirstMatrix.determinant(FirstMatrix.Arr));

	// write your code here
    }
}
