package ChapterSeven;

import java.util.Arrays;
/*
(Pixel Quantization) Use a one-dimensional array to solve the following problem: You want
to eventually perform some basic compression on an image. Assume that you will only be operating
on a single row of the image, and that pixel colors are represented as simple numbers in the array. You
are required to quantize the values of the pixels in the row. In other words, any pixel values appearing
in a range will assume a value in that range as indicated below. This creates redundancy that can lead
to better compression. Overwrite the original values in the array.
a) For 0–20: 10
b) For 21–40: 30
c) For 41–60: 50
d) For 61–80: 70
e) For 81–100: 90
f) For 101–120: 110
g) For 121–140: 130
h) For 141–160: 150
i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
Print the array with the new, quantized values.
 */
public class PixelQuantization {

    public static void main(String[] args) {

        int[] array = {62, 90, 75, 87, 119, 169, 35, 42, 19, 28};

        for (int count = 0; count < array.length; count++) {

            if (array[count] >= 0 && array[count] <= 20) {
                array[count] = 10;
            }
            if (array[count] >= 21 && array[count] <= 40) {
                array[count] = 30;
            }
            if (array[count] >= 41 && array[count] <= 60) {
                array[count] = 50;
            }
            if (array[count] >= 61 && array[count] <= 80) {
                array[count] = 70;
            }
            if (array[count] >= 81 && array[count] <= 100) {
                array[count] = 90;
            }
            if (array[count] >= 101 && array[count] <= 120) {
                array[count] = 110;
            }
            if (array[count] >= 121 && array[count] <= 140) {
                array[count] = 130;
            }
             if (array[count] >= 141 && array[count] <= 160) {
                array[count] = 150;
            }
             if (array[count] >= 161 && array[count] <= 180) {
                array[count] = 170;
            }
             if (array[count] > 181) {
                array[count] = 190;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
