import java.util.Arrays;
import java.util.Scanner;
public class Main {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int[] list = {15,12,788,1,-1,-778,2,0};
                System.out.print("Dizi: ");
                System.out.println(Arrays.toString(list));

                System.out.print("Yakınlık tespiti için bir sayı giriniz: ");
                int input = s.nextInt();
                // En yakındaki büyük ve küçük sayıları depola
                int bigger = list[0], smaller = list[0];
                // Sayılara yakınlıkları depola.
                int biggerD = 0, smallerD = 0;
                for (int i: list)
                {
                    // Alttan yakınlar
                    if (i < input)
                    {
                        // Başlangıç ve/veya girdiyle aynı değerdeki dizi elemanlarını kontrol et
                        if (biggerD == 0)
                        {
                            biggerD = input - i;
                            bigger = i;
                        }
                        else if (input - i < biggerD)
                        {
                            biggerD = input - i;
                            bigger = i;
                        }
                    }
                    // Üstten yakınlar
                    else if (input < i)
                    {
                        // Başlangıç ve/veya girdiyle aynı değerdeki dizi elemanlarını kontrol et
                        if (smallerD == 0)
                        {
                            smallerD = i - input;
                            smaller = i;
                        }
                        else if (i - input < smallerD)
                        {
                            smallerD = i - input;
                            smaller = i;
                        }
                    }
                }

                    System.out.println("Girilen sayı: " + input);
                    // Son kontroller
                    if (bigger >= input)
                    {
                        System.out.println("Dizide girilen sayıdan küçük bir sayı yok.");
                    }
                    else
                    {
                        System.out.println("Girilen sayıdan küçük en yakın sayı: " + bigger);
                    }
                    if (smaller <= input)
                    {
                        System.out.println("Dizide girilen sayıdan büyük bir sayı yok.");
                    }
                    else
                    {
                        System.out.println("Girilen sayıdan büyük en yakın sayı: " + smaller);
                    }




            }


}
