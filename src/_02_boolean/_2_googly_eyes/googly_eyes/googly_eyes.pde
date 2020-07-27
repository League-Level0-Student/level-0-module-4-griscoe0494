PImage face;
void setup() {
  face=loadImage("face.jpg");
}

void draw() {
  size(600,600);
}


   // Find the Googly Eyes recipe program ( googly_eyes.pde ) and open it using Processing.
   //Find an image on the internet and drop it into your sketch. It can be anything as long as it has large eyes!
   // On line 1 of your sketch (outside of the methods) declare a variable for the image:

  //     PImage face;

  //  In your setup() method, import your image using the following code:

  //      face = loadImage(“face.jpg”);

  //  If you need to, change the code you just entered so that “face.jpg” matches the name of your picture.
  //  Set the size of your sketch and the size of your image to be the same by entering the following code in the setup method.

  //      face.resize(width,height);

  //  In the draw() method, place a white ellipse over the left eye of your image.
  //  HINT: To find out where to put it, add code to print the mouseX and mouseY where you click the mouse.
   // Now add a pupil (the black part) to the left eye earlier.
 //   Use mouseX and mouseY to move the left pupil where the mouse moves.
   // Add a white ellipse over the right eye using the same technique used for the left eye.
   // Add a right pupil and make it move by using mouseX + [distance from left eye] and mouseY + [distance from left eye].
   // Here’s the tricky part: stop the pupils from going outside of the white circles! To do this, imagine a rectangle that the pupil should stay within. When mouseX and mouseY goes outside of these bounds, set it back to the boundary. Put this code before you draw the pupils.
  //  Make sure you SAVE YOUR CODE when you are done.
