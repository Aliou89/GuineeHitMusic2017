package com.guineehitmusique.com.guineehitmusic1.providers.tv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.guineehitmusique.com.guineehitmusic1.MainActivity;
import com.guineehitmusique.com.guineehitmusic1.R;
import com.guineehitmusique.com.guineehitmusic1.util.Helper;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * This fragment is used to play live video streams.
 */
public class TvFragment extends Fragment {

    private MainActivity mAct;
    private RelativeLayout rl;

    private JCVideoPlayerStandard jcVideoPlayerStandard;

    /** Called when the activity is first created. */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (!(getActivity() instanceof MainActivity)) throw new AssertionError();

        rl = (RelativeLayout) inflater.inflate(R.layout.fragment_tv, container, false);
        jcVideoPlayerStandard = (JCVideoPlayerStandard) rl.findViewById(R.id.custom_videoplayer_standard);

        return rl;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAct = (MainActivity) getActivity();

        Helper.isOnline(mAct, true);

        String streamurl = this.getArguments().getStringArray(MainActivity.FRAGMENT_DATA)[0];

        jcVideoPlayerStandard.setUp(streamurl, "");
        jcVideoPlayerStandard.startButton.performClick();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        JCVideoPlayer.releaseAllVideos();
    }

}


