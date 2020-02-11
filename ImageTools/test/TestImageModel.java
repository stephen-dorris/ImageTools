import org.junit.Test;

import java.io.IOException;

import imagetools.model.ColorOp;
import imagetools.model.FilterOp;
import imagetools.model.Image;
import imagetools.model.ImageModel;
import imagetools.model.ImageModelImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Test class for Image Model Implementation.
 */
public class TestImageModel {

//
//  @Test
//  public void testFilter() {
//
//    Image blurred_pic;
//    try {
//      Image pic = new Image("testfilterpic.jpg", new int[][][]{
//              {{120, 250, 0}, {255, 0, 0}, {255, 0, 0}},
//              {{0, 0, 255}, {0, 255, 0}, {0, 255, 0}}
//      });
//
//      // represents 3-D array of pics filtering.
//      int[][][] filtered = new int[][][]{
//              {{61, 62, 0}, {78, 31, 0}, {31, 0, 0}},
//              {{30, 31, 0}, {39, 15, 0}, {15, 0, 0}}
//      };
//
//
//      ImageModel model = new ImageModelImpl(pic);
//   //   blurred_pic = model.filter(FilterOp.Blur);
//
//      for (int i = 0; i < blurred_pic.getLength(); i++) {
//        for (int j = 0; j < blurred_pic.getImageArray()[0].length; j++) {
//          for (int v = 0; v < 3; v++) {
//            assertEquals(filtered[i][j][v], blurred_pic.getImageArray()[i][j][v]);
//          }
//        }
//      }
//    } catch (IOException e) {
//      fail();
//    }
//  }
//
//  @Test
//  public void testColor() throws IOException {
//
//    Image x = new Image("test.jpg", new int[][][]{
//            {{120, 250, 0}, {255, 0, 0}, {255, 0, 0}},
//            {{0, 0, 255}, {0, 255, 0}, {0, 255, 0}}
//    });
//
//    try {
//      Image test = new Image("testcolor.jpg", new int[][][]{
//              {{120, 250, 0}, {255, 0, 0}, {255, 0, 0}},
//              {{0, 0, 255}, {0, 255, 0}, {0, 255, 0}}
//      });
//
//
//      // represents sepia version of the testsepia image.
//      int[][][] sepia = new int[][][]{
//              {{239, 213, 166}, {100, 89, 69}, {0, 0, 0}},
//              {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}
//      };
//
//      ImageModel model = new ImageModelImpl(test);
//      model.colorTransform(ColorOp.Sepia);
//
//      for (int i = 0; i < model.getLength(); i++) {
//        for (int j = 0; j < test_sepia.getImageArray()[0].length; j++) {
//          for (int v = 0; v < 3; v++) {
//            assertEquals(sepia[i][j][v], test_sepia.getImageArray()[i][j][v]);
//          }
//        }
//      }
//    } catch (IOException e) {
//      fail();
//    }
//  }
}
