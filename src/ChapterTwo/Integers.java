package ChapterTwo;

import java.util.Scanner;
/*
2.24 (Largest and Smallest Integers) Write an application that reads five integers
    and determines and prints the largest and smallest integers in the group.
    Use only the programming techniques you learned in this chapter.
 */
public class Integers {

        public static void main(String[]args){

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your first integer: ");
            int userInput1 = input.nextInt();
            System.out.println("Enter your second integer: ");
            int userInput2 = input.nextInt();
            System.out.println("Enter your third integer: ");
            int userInput3 = input.nextInt();
            System.out.println("Enter your fourth integer: ");
            int userInput4 = input.nextInt();
            System.out.println("Enter your fifth integer: ");
            int userInput5 = input.nextInt();

            if (userInput1 > userInput2){
                if (userInput1 > userInput3){
                    if (userInput1 > userInput4){
                        if (userInput1 > userInput5){
                            System.out.printf("%d is the largest number ", userInput1);
                        }
                    }
                }
            }

            if (userInput1<userInput2){
                if (userInput1<userInput3){
                    if (userInput1<userInput4){
                        if (userInput1<userInput5){
                            System.out.printf("%d is the smallest number ", userInput1 );
                        }
                    }
                }
            }

            if (userInput2>userInput1){
                if (userInput2>userInput3){
                    if (userInput2>userInput4){
                        if (userInput2>userInput5){
                            System.out.printf("%d is the largest number ", userInput2);


                        }
                    }
                }
            }

            if (userInput2<userInput1){
                if (userInput2<userInput3){
                    if (userInput2<userInput4){
                        if (userInput2<userInput5){
                            System.out.printf("%d is the smallest number ", userInput2);
                        }
                    }
                }
            }

            if (userInput3 > userInput1){
                if (userInput3 > userInput2){
                    if (userInput3 > userInput4){
                        if (userInput3 > userInput5){
                            System.out.printf("%d is the largest number ", userInput3);
                        }
                    }
                }
            }

            if (userInput3<userInput1){
                if (userInput3<userInput2){
                    if (userInput3<userInput4){
                        if (userInput3<userInput5){
                            System.out.printf("%d is the smallest number ", userInput3 );
                        }
                    }
                }
            }

            if (userInput4>userInput1){
                if (userInput4>userInput2){
                    if (userInput4>userInput3){
                        if (userInput4>userInput5){
                            System.out.printf("%d is the largest number ", userInput4);


                        }
                    }
                }
            }

            if (userInput4<userInput1){
                if (userInput4<userInput2){
                    if (userInput4<userInput3){
                        if (userInput4<userInput5){
                            System.out.printf("%d is the smallest number ", userInput4);
                        }
                    }
                }
            }

            if (userInput5>userInput1){
                if (userInput5>userInput2){
                    if (userInput5>userInput3){
                        if (userInput5>userInput4){
                            System.out.printf("%d is the largest number ", userInput5);


                        }
                    }
                }
            }

            if (userInput5<userInput1){
                if (userInput5<userInput2){
                    if (userInput5<userInput3){
                        if (userInput5<userInput4){
                            System.out.printf("%d is the smallest number ", userInput5);
                        }
                    }
                }
            }

        }

    }

