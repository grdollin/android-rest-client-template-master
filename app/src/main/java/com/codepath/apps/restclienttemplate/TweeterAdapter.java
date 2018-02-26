package com.codepath.apps.restclienttemplate;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.restclienttemplate.models.Tweet;

import java.util.List;

/**
 * Created by brh on 2/25/2018.
 */

public class TweeterAdapter extends  RecyclerView.Adapter<TweeterAdapter.ViewHolder>{

    private  List<Tweet> mTweets;

    //pass in the tweets array in the constructor
    public  TweeterAdapter (List<Tweet> tweets){
        mTweets=tweets;
    }
    //for each row,inflate the layout and cache references ViewHolder

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);

        View tweetView =inflater.inflate(R.layout.item_tweet,parent ,false);
        ViewHolder viewHolder=new ViewHolder(tweetView);
        return viewHolder;
    }


    //bind the values based on the position of the element

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //get the data according to mposition
        Tweet tweet=mTweets.get(position);

        //populate the views according to this data
        holder.tvUsername.setText(tweet.user.name);
        holder.tvBody.setText(tweet.body);

    }

    @Override
    public int getItemCount() {
        return mTweets.size();
    }

    //create ViewHolder class
    public  static  class  ViewHolder extends RecyclerView.ViewHolder{
      public ImageView ivProfileImage;
      public TextView tvUsername;
      public TextView tvBody;

    public ViewHolder(View itemView){
        super(itemView);

        //perfom findViewById lookups

        ivProfileImage=(ImageView) itemView.findViewById(R.id.ivProfileImage);
        tvUsername=(TextView) itemView.findViewById(R.id.tvUserName);
        tvBody=(TextView) itemView.findViewById(R.id.tvBody);


    }

     }
}

