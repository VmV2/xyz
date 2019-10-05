package dich;



import java.util.Scanner;

public class dich_v_kvadrate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char winner=' ';
        int c = 0;
        int turn = 0;
        boolean game = false;
        char[][] simb = new char[15][15];
        for (int i = 1; i <= 5; i++) {
            for (int q = 1; q <= 9; q++) {
                simb[q][i] = ' ';
            }

        }
        while (game != true) {
            System.out.println("Введите координаты клетки по типу x/y ");
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x < 0 || y < 0 || x > 2 || y > 2) {
                while (x < 0 || y < 0 || x > 2 || y > 2) {
                    System.out.println("Введите корректные координаты в диапозоне 0<x<2  0<y<2");
                    x = scan.nextInt();
                    y = scan.nextInt();
                }
            }
            int xstr = 4 * x + 1;
            int ystr = 2 * y + 1;
            if (simb[xstr][ystr] != ' ') {
                while (simb[xstr][ystr] != ' ') {
                    System.out.println("Место занято, введите по-нормальному!");
                    x = scan.nextInt();
                    y = scan.nextInt();
                    xstr = 4 * x + 1;
                    ystr = 2 * y + 1;
                }
            }


            for (int i = 1; i <= 5; i++) {
                for (int q = 1; q <= 9; q++) {
                    if (i == 2 || i == 4) {

                        simb[q][i] = '-';


                    } else {

                        if (q == 3 || q == 7) {
                            simb[q][i] = '|';

                        } else {

                            if (simb[q][i] == ' ') {
                                simb[q][i] = ' ';
                            }


                        }

                    }

                }

            }
            if (turn % 2 == 0) {
                simb[14][14] = 'X';
            } else {
                simb[14][14] = 'O';
            }

            simb[xstr][ystr] = simb[14][14];
            for (int i = 1; i <= 5; i++) {
                for (int q = 1; q <= 9; q++) {
                    System.out.print(simb[q][i]);
                }
                System.out.println();
            }


            //по вертикали

            for (int q = 0; q <= 2; q++) {    // 3 раза
                for (int i = 0; i <= 1; i++) {  // 2 раза
                    if (simb[4 * q + 1][2 * i + 1] == simb[4 * q + 1][2 * i + 3] && simb[4 * q + 1][2 * i + 1] != ' ' && simb[4 * q + 1][2 * i + 3] != ' ') {
                        c = c + 1;
                        if (c == 2) {
                            game = true;
                            if (turn!=9) {
                                winner = simb[4 * q + 1][2 * i + 1];
                                System.out.println("Победитель " + winner);
                            }
                            else{
                                System.out.println("Ничья");
                            }
                        }
                    }
                }
                c=0;
            }
            c=0;
            for (int i = 0; i <= 2; i++) { //по горизонтали    3 раза
                for (int q = 0; q <= 1; q++) { //2 раза
                    if (simb[4 * q + 1][2 * i + 1] == simb[4 * q + 5][2 * i + 1] && simb[4 * q + 1][2 * i + 1] != ' ' && simb[4 * q + 5][2 * i + 1] != ' ') {
                        c = c + 1;
                        if (c == 2) {
                            game = true;
                            if (turn!=9) {
                                winner = simb[4 * q + 1][2 * i + 1];
                                System.out.println("Победитель " + winner);
                            }
                            else{
                                System.out.println("Ничья");
                            }
                        }
                    }
                }
                c=0;
            }
            c=0;
            int q=0;
            for (int i = 0; i <= 1; i++) {

                    if (simb[4 * q + 1][2 * i + 1] == simb[4 * q + 5][2 * i + 3] && simb[4 * q + 1][2 * i + 1] != ' ' && simb[4 * q + 5][2 * i + 3] != ' ') {
                        c = c + 1;
                        if (c == 2) {
                            game = true;
                            if (turn!=9) {
                                winner = simb[4 * q + 1][2 * i + 1];
                                System.out.println("Победитель " + winner);
                            }
                            else{
                                System.out.println("Ничья");
                            }
                        }
                    }
                q=q+1;
                    c=0;
            }
            c=0;
            q=0;
            for (int i = 0; i <= 1; i++) {

                    if (simb[4 *q + 1][5-2*i] == simb[4 *q+5][3-2*i] &&  simb[4 *q + 1][5-2*i]!= ' ' &&  simb[4 *q+5][3-2*i]!= ' ') {
                        c = c + 1;
                        if (c == 2) {
                            game = true;
                            if (turn!=9) {
                                winner = simb[4 * q + 1][2 * i + 1];
                                System.out.println("Победитель " + winner);
                            }
                            else{
                                System.out.println("Ничья");
                            }
                        }
                    }
                    c=0;
                q=q+1;
            }
            c=0;
            turn = turn + 1;

            if (turn == 9 && winner!='X'&& winner!='O') {
                System.out.println("Ничья");
                game = true;
            }
        }
    }
    }
    /*

 qqqqqqqqqqq
  |   |     i
---------   i
  | X |     i
---------   i
  |   |     i





     */
