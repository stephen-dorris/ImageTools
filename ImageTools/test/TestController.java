
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import imagetools.controller.Controller;
import imagetools.model.ImageMockModel;
import imagetools.model.ImageModel;

import static org.junit.Assert.assertArrayEquals;


/**
 * Test for controller using ImageModel mock class that mimics the real model and writes to a file
 * to test what methods were called when.
 */
public class TestController {


  /**
   * This test a proper batch command file that has one generation  and one operation.
   */
  @Test
  public void testControllerSimple() {
    String[] correctMockTxt = new String[]
    {"rainbow-100-100-Horizontal-rainbow.png",
     "loaded cat.JPG",
     "dither-dither-cat.jpg"};

    try {


      ImageModel mockModel = new ImageMockModel();
      //Controller c = new Controller(mockModel, "testShort.txt");
     // c.start();
      BufferedReader reader = new BufferedReader(new FileReader("mock.txt"));

      List<String> lines = new ArrayList<>();

      String line;
      while ((line = reader.readLine()) != null) {

        lines.add(line);

      }
      String[] testMockText = new String[lines.size()];
      Iterator<String> it = lines.iterator();
      int i = 0;
      while (it.hasNext()) {
        String s = it.next();
        testMockText[i] = s;
        i++;
      }


      // Assert that mock model  was called properly
      assertArrayEquals(correctMockTxt, testMockText);


    }
    catch (IOException e) {

      System.out.println("Exception\n");
    }


  }


  /**
   * This tests a proper batch commands file that has multiple loads and operations.
   */
  @Test
  public void testControllerGood() {

    String[] correctMockTxt = new String[]
    {"rainbow-256-256-Vertical-rainbow.png",
     "rainbow-256-256-Horizontal-rainbow2.png",
     "loaded cat.JPG", "dither-cat-dither.jpg",
     "mosaic-3000-cat-mosaic.jpg",
     "loaded cat-mosaic.jpg",
     "dither-cat-dither-mosaic.jpg"
    };


    try {
      ImageModel mockModel = new ImageMockModel();
     // Controller c = new Controller(mockModel, "test.txt");
   //   c.start(); // writes to mock.txt
      // now read mock.txt to array.


      BufferedReader reader = new BufferedReader(new FileReader("mock.txt"));

      List<String> lines = new ArrayList<>();

      String line;
      while ((line = reader.readLine()) != null) {

        lines.add(line);

      }
      String[] testMockText = new String[lines.size()];
      Iterator<String> it = lines.iterator();
      int i = 0;
      while (it.hasNext()) {
        String s = it.next();
        testMockText[i] = s;
        i++;
      }


      // Assert that mock model  was called properly
      assertArrayEquals(correctMockTxt, testMockText);

    }
    catch (IOException e) {
      System.out.println("IO Exception\n");
    }

  }

  /**
   * Tests an illegal command batch file.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testFail() {
    try {

      ImageModel mockModel = new ImageMockModel();
    //  Controller c = new Controller(mockModel, "testFail.txt");
    //  c.start(); // writes to mock.txt
      // now read mock.txt to array.
    }
    catch (IOException e) {
      System.out.println("IO Exception\n");
    }


  }


}
