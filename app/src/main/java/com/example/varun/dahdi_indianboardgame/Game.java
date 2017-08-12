package com.example.varun.dahdi_indianboardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Game extends AppCompatActivity {


    int smallRed=0;
    int smallYellow=0;
    int[] imageArray={2,2,2,2,2,2,2,2,2};
    int player=0;
    int redLast=0;
    int yellowLast=0;
    int yellowWin=-1;
    int redWin=-1;
    int[] yellowWinArray={0,0,0,0,0,0,0,0};
    int[] redWinArray={0,0,0,0,0,0,0,0};






    public void goToMainActivity(View view){



        Intent i=new Intent(getApplicationContext(), MainActivity.class);

        startActivity(i);
    }

    public void goToInstructions(View view){



        Intent i=new Intent(getApplicationContext(), Instructions.class);

        startActivity(i);
    }




    public void click(View view){



        ImageView image = (ImageView) view;
        int value=Integer.parseInt(image.getTag().toString());


        if(player==6){
            Toast.makeText(getApplicationContext(), "Please Restart The Match To Continue", Toast.LENGTH_SHORT).show();
        }else {


            if (player == 4) {
                if (imageArray[value] == 2) {
                    imageArray[value] = 0;
                    imageArray[redLast] = 2;
                    player = 1;
                } else {
                    Toast.makeText(getApplicationContext(), "Please Select Adjacent Empty Spot To Move The Coin", Toast.LENGTH_SHORT).show();
                }


            } else if (player == 5) {

                if (imageArray[value] == 2) {
                    imageArray[value] = 1;
                    imageArray[yellowLast] = 2;
                    player = 0;
                } else {
                    Toast.makeText(getApplicationContext(), "Please Select Adjacent Empty Spot To Move The Coin", Toast.LENGTH_SHORT).show();
                }


            } else if (player == 0) {
                if (imageArray[value] == 2) {
                    if (smallRed <= 2) {
                        imageArray[value] = 0;
                        player = 1;
                        smallRed++;
                    } else {
                        Toast.makeText(getApplicationContext(), "Please Select A Red Coin To Move", Toast.LENGTH_SHORT).show();

                    }


                } else if (imageArray[value] == 0) {
                    redLast = value;

                    if (redLast == 0) {

                        if (imageArray[1] == 2 || imageArray[3] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    } else if (redLast == 1) {
                        if (imageArray[0] == 2 || imageArray[2] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }

                    } else if (redLast == 2) {

                        if (imageArray[1] == 2 || imageArray[5] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    } else if (redLast == 3) {

                        if (imageArray[0] == 2 || imageArray[6] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    } else if (redLast == 4) {

                        player = 4;

                    } else if (redLast == 5) {

                        if (imageArray[2] == 2 || imageArray[8] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    } else if (redLast == 6) {

                        if (imageArray[3] == 2 || imageArray[7] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    } else if (redLast == 7) {

                        if (imageArray[6] == 2 || imageArray[8] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    } else if (redLast == 8) {

                        if (imageArray[7] == 2 || imageArray[5] == 2 || imageArray[4] == 2) {

                            player = 4;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 0;
                        }
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Select Empty Spot or Red Coin To Move", Toast.LENGTH_SHORT).show();
                }

            } else if (player == 1) {
                if (imageArray[value] == 2) {
                    if (smallYellow <= 2) {
                        imageArray[value] = 1;
                        player = 0;
                        smallYellow++;
                    } else {
                        Toast.makeText(getApplicationContext(), "Please Select A Yellow Coin To Move ", Toast.LENGTH_SHORT).show();
                    }

                } else if (imageArray[value] == 1) {
                    yellowLast = value;

                    if (yellowLast == 0) {

                        if (imageArray[1] == 2 || imageArray[3] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    } else if (yellowLast == 1) {
                        if (imageArray[0] == 2 || imageArray[2] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }

                    } else if (yellowLast == 2) {

                        if (imageArray[1] == 2 || imageArray[5] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    } else if (yellowLast == 3) {

                        if (imageArray[0] == 2 || imageArray[6] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    } else if (yellowLast == 4) {

                        player = 5;

                    } else if (yellowLast == 5) {

                        if (imageArray[2] == 2 || imageArray[8] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    } else if (yellowLast == 6) {

                        if (imageArray[3] == 2 || imageArray[7] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    } else if (yellowLast == 7) {

                        if (imageArray[6] == 2 || imageArray[8] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    } else if (yellowLast == 8) {

                        if (imageArray[7] == 2 || imageArray[5] == 2 || imageArray[4] == 2) {

                            player = 5;

                        } else {
                            Toast.makeText(getApplicationContext(), "No Adjacent Empty Space To Move, Please Select Other Move", Toast.LENGTH_SHORT).show();
                            player = 1;
                        }
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Please Select Empty Spot or Yellow Coin To Move", Toast.LENGTH_SHORT).show();
                }

            } else if (player == 2) {
                if (imageArray[value] == 1) {
                    imageArray[value] = 2;
                    player = 1;

                    ImageView image0 = (ImageView) findViewById(R.id.winPosition0);
                    image0.animate().alpha(0f);
                    ImageView image1 = (ImageView) findViewById(R.id.winPosition1);
                    image1.animate().alpha(0f);
                    ImageView image2 = (ImageView) findViewById(R.id.winPosition2);
                    image2.animate().alpha(0f);
                    ImageView image3 = (ImageView) findViewById(R.id.winPosition3);
                    image3.animate().alpha(0f);
                    ImageView image4 = (ImageView) findViewById(R.id.winPosition4);
                    image4.animate().alpha(0f);
                    ImageView image5 = (ImageView) findViewById(R.id.winPosition5);
                    image5.animate().alpha(0f);
                    ImageView image6 = (ImageView) findViewById(R.id.winPosition6);
                    image6.animate().alpha(0f);
                    ImageView image7 = (ImageView) findViewById(R.id.winPosition7);
                    image7.animate().alpha(0f);


                } else {
                    Toast.makeText(getApplicationContext(), "Please Select Yellow Coin to Capture", Toast.LENGTH_SHORT).show();
                }

            } else if (player == 3) {
                if (imageArray[value] == 0) {
                    imageArray[value] = 2;
                    player = 0;

                    ImageView image0 = (ImageView) findViewById(R.id.winPosition0);
                    image0.animate().alpha(0f);
                    ImageView image1 = (ImageView) findViewById(R.id.winPosition1);
                    image1.animate().alpha(0f);
                    ImageView image2 = (ImageView) findViewById(R.id.winPosition2);
                    image2.animate().alpha(0f);
                    ImageView image3 = (ImageView) findViewById(R.id.winPosition3);
                    image3.animate().alpha(0f);
                    ImageView image4 = (ImageView) findViewById(R.id.winPosition4);
                    image4.animate().alpha(0f);
                    ImageView image5 = (ImageView) findViewById(R.id.winPosition5);
                    image5.animate().alpha(0f);
                    ImageView image6 = (ImageView) findViewById(R.id.winPosition6);
                    image6.animate().alpha(0f);
                    ImageView image7 = (ImageView) findViewById(R.id.winPosition7);
                    image7.animate().alpha(0f);

                } else {
                    Toast.makeText(getApplicationContext(), "Please Select Red Coin To Capture", Toast.LENGTH_SHORT).show();
                }

            }


            visible();
            check(view);
        }

    }

    public void check(View view){

        boolean flag=false;

        if(imageArray[0]==imageArray[1] && imageArray[1]==imageArray[2] && imageArray[0]!=2) {
            if (imageArray[0] == 0) {
                redWin = 0;
                if (redWinArray[redWin] == 0) {
                    win(0, 0, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 0;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 0, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            if(imageArray[0]==imageArray[1] && imageArray[1]==imageArray[2]){
                if(imageArray[0]==2){
                    redWinArray[0]=0;
                    yellowWinArray[0]=0;
                }
            }else{
                redWinArray[0]=0;
                yellowWinArray[0]=0;
            }
        }

        if(imageArray[3]==imageArray[4] && imageArray[4]==imageArray[5] && imageArray[3]!=2) {
            if (imageArray[3] == 0) {
                redWin = 1;
                if (redWinArray[redWin] == 0) {
                    win(0, 1, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 1;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 1, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[1]=0;
            yellowWinArray[1]=0;
        }
        if(imageArray[6]==imageArray[7] && imageArray[7]==imageArray[8] && imageArray[6]!=2) {
            if (imageArray[6] == 0) {
                redWin = 2;
                if (redWinArray[redWin] == 0) {
                    win(0, 2, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 2;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 2, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[2]=0;
            yellowWinArray[2]=0;
        }

        if(imageArray[0]==imageArray[3] && imageArray[3]==imageArray[6] && imageArray[0]!=2) {
            if (imageArray[0] == 0) {
                redWin = 3;
                if (redWinArray[redWin] == 0) {
                    win(0, 3, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 3;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 3, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[3]=0;
            yellowWinArray[3]=0;
        }

        if(imageArray[1]==imageArray[4] && imageArray[4]==imageArray[7] && imageArray[1]!=2) {
            if (imageArray[1] == 0) {
                redWin = 4;
                if (redWinArray[redWin] == 0) {
                    win(0, 4, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 4;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 4, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[4]=0;
            yellowWinArray[4]=0;
        }

        if(imageArray[2]==imageArray[5] && imageArray[5]==imageArray[8] && imageArray[2]!=2) {
            if (imageArray[2] == 0) {
                redWin = 5;
                if (redWinArray[redWin] == 0) {
                    win(0, 5, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 5;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 5, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[5]=0;
            yellowWinArray[5]=0;
        }

        if(imageArray[6]==imageArray[4] && imageArray[4]==imageArray[2] && imageArray[6]!=2) {
            if (imageArray[6] == 0) {
                redWin = 6;
                if (redWinArray[redWin] == 0) {
                    win(0, 6, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 6;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 6, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[6]=0;
            yellowWinArray[6]=0;
        }

        if(imageArray[0]==imageArray[4] && imageArray[4]==imageArray[8] && imageArray[0]!=2) {
            if (imageArray[0] == 0) {
                redWin = 7;
                if (redWinArray[redWin] == 0) {
                    win(0, 7, view);

                    redWinArray[redWin] = 1;
                    flag=true;
                }
            } else {
                yellowWin = 7;
                if (yellowWinArray[yellowWin] == 0) {
                    win(1, 7, view);

                    yellowWinArray[yellowWin] = 1;
                    flag=true;
                }

            }
        }else{
            redWinArray[7]=0;
            yellowWinArray[7]=0;
        }

        if(imageArray[0]==2 || imageArray[1]==2 || imageArray[2]==2 || imageArray[3]==2 || imageArray[4]==2 || imageArray[5]==2 || imageArray[6]==2 || imageArray[7]==2
                 || imageArray[8]==2 ){


        }else{
            if(!flag){
                Toast.makeText(getApplicationContext(), "Match Ended In a Draw, Please Restart", Toast.LENGTH_SHORT).show();
            }
        }




    }



    public void win(int i, int y, View view){
        if(i==0){
            Toast.makeText(getApplicationContext(), "Congratulations, Red Won The Match", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(getApplicationContext(), "Congratulations, Yellow Won The Match", Toast.LENGTH_SHORT).show();

        }

        if(y==0){
            ImageView image0=(ImageView)findViewById(R.id.winPosition0);
            image0.animate().alpha(1f);
        }else if(y==1){
            ImageView image1=(ImageView)findViewById(R.id.winPosition1);
            image1.animate().alpha(1f);
        }else if(y==2){
            ImageView image2=(ImageView)findViewById(R.id.winPosition2);
            image2.animate().alpha(1f);
        }else if(y==3){
            ImageView image3=(ImageView)findViewById(R.id.winPosition3);
            image3.animate().alpha(1f);
        }else if(y==4){
            ImageView image4=(ImageView)findViewById(R.id.winPosition4);
            image4.animate().alpha(1f);
        }else if(y==5){
            ImageView image5=(ImageView)findViewById(R.id.winPosition5);
            image5.animate().alpha(1f);
        }else if(y==6){
            ImageView image6=(ImageView)findViewById(R.id.winPosition6);
            image6.animate().alpha(1f);
        }else if(y==7){
            ImageView image7=(ImageView)findViewById(R.id.winPosition7);
            image7.animate().alpha(1f);
        }

        player=6;




    }




    public void visible(){

        smallVisible();
        imageVisible();
        playerVisible();


    }
    public void playerVisible(){
        ImageView image=(ImageView) findViewById(R.id.moveImage);
        if(player==0){
            image.setImageResource(R.drawable.redmove);
        }else if(player==1){
            image.setImageResource(R.drawable.yellowmove);
        }else if(player==2){
            image.setImageResource(R.drawable.redsmovetocapture);
        }else if(player==3){
            image.setImageResource(R.drawable.yellowsmovetocapture);
        }else if(player==4){
            image.setImageResource(R.drawable.redspottomove);
        }else if(player==5){
            image.setImageResource(R.drawable.yellowspottomove);
        }
    }
    public void imageVisible(){

        for(int i=0; i<9; i++){

            if(i==0){
                ImageView image=(ImageView) findViewById(R.id.image0);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }

            }else if(i==1){
                ImageView image=(ImageView) findViewById(R.id.image1);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==2){
                ImageView image=(ImageView) findViewById(R.id.image2);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==3){
                ImageView image=(ImageView) findViewById(R.id.image3);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==4){
                ImageView image=(ImageView) findViewById(R.id.image4);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==5){
                ImageView image=(ImageView) findViewById(R.id.image5);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==6){
                ImageView image=(ImageView) findViewById(R.id.image6);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==7){
                ImageView image=(ImageView) findViewById(R.id.image7);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }else if(i==8){
                ImageView image=(ImageView) findViewById(R.id.image8);
                if(imageArray[i]==2){
                    image.setImageDrawable(null);
                }else if(imageArray[i]==0){
                    image.setImageResource(R.drawable.red);
                }else if(imageArray[i]==1){
                    image.setImageResource(R.drawable.yellow);
                }
            }


        }



    }

    public void smallVisible() {

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                if (i >= smallRed) {
                    ImageView image = (ImageView) findViewById(R.id.smallRed0);
                    image.setImageResource(R.drawable.red);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.smallRed0);
                    image.setImageDrawable(null);

                }
            } else if (i == 1) {
                if (i >= smallRed) {
                    ImageView image = (ImageView) findViewById(R.id.smallRed1);
                    image.setImageResource(R.drawable.red);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.smallRed1);
                    image.setImageDrawable(null);

                }
            } else if (i == 2) {
                if (i >= smallRed) {
                    ImageView image = (ImageView) findViewById(R.id.smallRed2);
                    image.setImageResource(R.drawable.red);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.smallRed2);
                    image.setImageDrawable(null);

                }
            }
        }

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                if (i >= smallYellow) {
                    ImageView image = (ImageView) findViewById(R.id.smallYellow0);
                    image.setImageResource(R.drawable.yellow);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.smallYellow0);
                    image.setImageDrawable(null);

                }
            } else if (i == 1) {
                if (i >= smallYellow) {
                    ImageView image = (ImageView) findViewById(R.id.smallYellow1);
                    image.setImageResource(R.drawable.yellow);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.smallYellow1);
                    image.setImageDrawable(null);

                }
            } else if (i == 2) {
                if (i >= smallYellow) {
                    ImageView image = (ImageView) findViewById(R.id.smallYellow2);
                    image.setImageResource(R.drawable.yellow);
                } else {
                    ImageView image = (ImageView) findViewById(R.id.smallYellow2);
                    image.setImageDrawable(null);

                }
            }
        }

    }

    public void restart(View view){
        Toast.makeText(getApplicationContext(), "Match Restarted", Toast.LENGTH_SHORT).show();

        smallRed=0;
        smallYellow=0;
        player=0;
        for(int i=0; i<imageArray.length; i++){
            imageArray[i]=2;
        }
        for(int i=0; i<yellowWinArray.length; i++){
            yellowWinArray[i]=0;
        }
        for(int i=0; i<redWinArray.length; i++){
            redWinArray[i]=0;
        }

        ImageView image0=(ImageView) findViewById(R.id.winPosition0);
        image0.animate().alpha(0f);
        ImageView image1=(ImageView) findViewById(R.id.winPosition1);
        image1.animate().alpha(0f);
        ImageView image2=(ImageView) findViewById(R.id.winPosition2);
        image2.animate().alpha(0f);
        ImageView image3=(ImageView) findViewById(R.id.winPosition3);
        image3.animate().alpha(0f);
        ImageView image4=(ImageView) findViewById(R.id.winPosition4);
        image4.animate().alpha(0f);
        ImageView image5=(ImageView) findViewById(R.id.winPosition5);
        image5.animate().alpha(0f);
        ImageView image6=(ImageView) findViewById(R.id.winPosition6);
        image6.animate().alpha(0f);
        ImageView image7=(ImageView) findViewById(R.id.winPosition7);
        image7.animate().alpha(0f);
        visible();

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        visible();
        ImageView image1=(ImageView) findViewById(R.id.winPosition6);
        image1.animate().rotation(45f);
        ImageView image2=(ImageView) findViewById(R.id.winPosition7);
        image2.animate().rotation(-45f);
    }
}
