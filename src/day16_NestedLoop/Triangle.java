package day16_NestedLoop;
/*
 Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */
public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("\t\t");// ilk sirayi yaziyoruz 10 sira istedigi icin 10 adet
                 for (int j = 0; j < i; j++) {
                System.out.print("*");// her siraya yildiz de yukselerek artiyor
            }
            System.out.println(); // her sira duzgun cikmasi icin zorunlu

        }

    }}

