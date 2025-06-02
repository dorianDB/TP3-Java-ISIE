package org.example.exercice1;

import java.io.*;

public class FileCopyTest {

    public static void copyFileUnbuffered(String sourcePath, String destPath) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            int octet;
            while ((octet = fis.read()) != -1) {
                fos.write(octet);
            }

            System.out.println("Copie sans buffer terminée.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileBuffered(String sourcePath, String destPath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {

            int octet;
            while ((octet = bis.read()) != -1) {
                bos.write(octet);
            }

            System.out.println("Copie avec buffer terminée.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testPerformance(String sourcePath) {
        String destUnbuffered = sourcePath.replace(".", "-unbuffered.");
        String destBuffered = sourcePath.replace(".", "-buffered.");

        long start = System.currentTimeMillis();
        copyFileUnbuffered(sourcePath, destUnbuffered);
        long durationUnbuffered = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        copyFileBuffered(sourcePath, destBuffered);
        long durationBuffered = System.currentTimeMillis() - start;

        System.out.println("\nTemps sans buffer : " + durationUnbuffered + " ms");
        System.out.println("Temps avec buffer : " + durationBuffered + " ms");
    }
}
