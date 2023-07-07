package Day05;

public class Quiz06 {
    public static void main(String[] args) {
        //
        int[] lotto = new int[45];
        int[] realLotto = new int[7];
        int[] personLotto = new int[45];
        int[] myLotto = new int[7];
        int howMany = 0;
        long[] money = new long[]{10000000000L, 1000000000, 1000000, 30000, 5000};
        int[] winNums = new int[5]; //1등부터 5등까지 당첨횟수
        int tryNums = 0;

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
            personLotto[i] = i + 1;
        }
        //n회차 당첨번호
        for (int i = 0; i < lotto.length * 100; i++) {
            int x = (int) (Math.random() * 45);
            int y = (int) (Math.random() * 45);
            int tmp = lotto[x];
            lotto[x] = lotto[y];
            lotto[y] = tmp;
        }

        for (int i = 0; i < realLotto.length; i++) {
            realLotto[i] = lotto[i];
        }

        int temp = 0;
        for (int i = 0; i < realLotto.length - 1; i++) {
            for (int j = 0; j < realLotto.length - 1; j++) {
                if (realLotto[j] > realLotto[j + 1]) {
                    temp = realLotto[j];
                    realLotto[j] = realLotto[j + 1];
                    realLotto[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < realLotto.length; i++) {
            System.out.println(realLotto[i]);
        }
        while (true) {
            for (int i = 0; i < personLotto.length * 100; i++) {
                int x = (int) (Math.random() * 45);
                int y = (int) (Math.random() * 45);
                int tmp = personLotto[x];
                personLotto[x] = personLotto[y];
                personLotto[y] = tmp;
            }
            for (int i = 0; i < myLotto.length; i++) {
                myLotto[i] = personLotto[i];
            }
            for (int i = 0; i < myLotto.length - 1; i++) {
                for (int j = 0; j < myLotto.length - 1; j++) {
                    if (myLotto[j] > myLotto[j + 1]) {
                        temp = myLotto[j];
                        myLotto[j] = myLotto[j + 1];
                        myLotto[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (realLotto[i] == myLotto[j]) {
                        //System.out.println("동일 숫자 - "+realLotto[i]+" , "+myLotto[j]);
                        howMany++;
                    }
                }
            }
            if (howMany == 6) {
                ++tryNums;
                System.out.println("당첨 번호 : " + myLotto[0] + " " + myLotto[1] + " " + myLotto[2] + " " + myLotto[3] + " " + myLotto[4] + " " + myLotto[5] + " " + myLotto[6] + "\t 1등 당첨!");
                winNums[0]++;
                System.out.println("========== 결산 ==========");
                System.out.println("이번주 당첨 번호 : " + realLotto[0] + " " + realLotto[1] + " " + realLotto[2] + " " + realLotto[3] + " " + realLotto[4] + " " + realLotto[5] + " " + realLotto[6] + "\t");
                System.out.println("1등 당첨 횟수 : " + winNums[0] + " 당첨 확률 : " + ((winNums[0] / 8145060.0)) + "");
                System.out.println("2등 당첨 횟수 : " + winNums[1] + " 당첨 확률 : " + ((winNums[1] / 8145060.0)) + "");
                System.out.println("3등 당첨 횟수 : " + winNums[2] + " 당첨 확률 : " + ((winNums[2] / 8145060.0)) + "");
                System.out.println("4등 당첨 횟수 : " + winNums[3] + " 당첨 확률 : " + ((winNums[3] / 8145060.0)) + "");
                System.out.println("5등 당첨 횟수 : " + winNums[4] + " 당첨 확률 : " + ((winNums[4] / 8145060.0)) + "");
                System.out.println("총 로또 구매 금액 : " + (tryNums * 5000) + "원");
                System.out.println("총 로또 당첨 금액 : " + ((money[0] * winNums[0]) + (money[1] * winNums[1]) + (money[2] * winNums[2]) + (money[3] * winNums[3]) + (money[4] * winNums[4])) + "원");
                break;
            } else if (howMany == 5 && lotto[6] == myLotto[6]) {
                ++tryNums;
                System.out.print("시도 횟수 : " + tryNums + " ");
                System.out.println("당첨 번호 : " + myLotto[0] + " " + myLotto[1] + " " + myLotto[2] + " " + myLotto[3] + " " + myLotto[4] + " " + myLotto[5] + " " + myLotto[6] + "\t 2등 당첨!");
                System.out.println("당첨 번호 개수 : " + howMany + " ");
                winNums[1]++;
            } else if (howMany == 5) {
                ++tryNums;
                System.out.print("시도 횟수 : " + tryNums + " ");
                System.out.println("당첨 번호 : " + myLotto[0] + " " + myLotto[1] + " " + myLotto[2] + " " + myLotto[3] + " " + myLotto[4] + " " + myLotto[5] + " " + myLotto[6] + "\t 3등 당첨!");
                System.out.println("당첨 번호 개수 : " + howMany + " ");
                winNums[4]++;
            } else if (howMany >= 4) {
                ++tryNums;
                System.out.print("시도 횟수 : " + tryNums + " ");
                System.out.println("당첨 번호 : " + myLotto[0] + " " + myLotto[1] + " " + myLotto[2] + " " + myLotto[3] + " " + myLotto[4] + " " + myLotto[5] + " " + myLotto[6] + "\t 4등 당첨!");
                System.out.println("당첨 번호 개수 : " + howMany + " ");
                winNums[2]++;
            } else if (howMany >= 3) {
                ++tryNums;
                System.out.print("시도 횟수 : " + tryNums + " ");
                System.out.println("당첨 번호 : " + myLotto[0] + " " + myLotto[1] + " " + myLotto[2] + " " + myLotto[3] + " " + myLotto[4] + " " + myLotto[5] + " " + myLotto[6] + "\t 5등 당첨!");
                System.out.println("당첨 번호 개수 : " + howMany + " ");
                winNums[3]++;
            } else {
                ++tryNums;
                System.out.print("시도 횟수 : " + tryNums + " ");
                System.out.println("당첨 번호 : " + myLotto[0] + " " + myLotto[1] + " " + myLotto[2] + " " + myLotto[3] + " " + myLotto[4] + " " + myLotto[5] + " " + myLotto[6] + "\t\t\t\t 당첨 실패 ㅠㅠ");
            }
            howMany = 0;
        }
    }
}