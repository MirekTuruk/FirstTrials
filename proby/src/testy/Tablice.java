package testy;

public class Tablice {
    public static void main(String[] args) {
int macierz [] [] = {
        {1, 2, 3},
        {4, 5, },
        {7, 8, }
};

    System.out.println(macierz[1][1]);
    for(int i = 0; i < 3; i++){
        for (int j = 0; j < macierz[i].length; j++){
            System.out.print(macierz[i][j] + " ");
        }
        System.out.println();
    }
}

    }


