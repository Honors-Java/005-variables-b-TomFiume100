int rectX = 0;
int rectY = 10;
int rectWidth = 200;
int rectHeight = 300;
int circleSize = 10;
int color = 150;
int color2 = 0;
int color3 = 0;

void setup() {
	size(350, 350);
  frameRate(30);
}

void draw() {
  stroke(0);
  fill(color,color2,color3);
  rect(rectX,rectY,rectWidth,rectHeight);

  fill((int) random(0,255),(int)random(0,255),(int) random(0,255));
  ellipse(mouseX + (int)random(1,50) ,mouseY + (int)random(1,50),circleSize,circleSize);
  
}

void mousePressed() {
  color =  random(0,255);
  color2 =  random(0,255);
  color3 =  random(0,255);
  background(255);
  rectX =  random(0,250);
  rectY = random(0,250);
  rectWidth =  random(0,250);
  rectHeight = random(0,250);
}
