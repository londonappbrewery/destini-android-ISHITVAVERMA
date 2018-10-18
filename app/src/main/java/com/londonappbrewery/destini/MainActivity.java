package com.londonappbrewery.destini;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button buttonTop;
    private Button buttonBottom;
    private TextView storyTextView;
    private int  mStoryIndex=1;
    // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                } else if (mStoryIndex == 2) {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 5;
                } else if (mStoryIndex == 5)
                {
                    storyTextView.setText(R.string.T6_End);
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility((View.GONE));
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom = (Button) findViewById(R.id.buttonBottom);

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                    }
                else if(mStoryIndex==2){
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
                else if(mStoryIndex == 3)
                {
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
                else if(mStoryIndex==5)
                {
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
            }
        });

        storyTextView = findViewById(R.id.storyTextView);
    }













    }

