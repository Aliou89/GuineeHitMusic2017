package com.guineehitmusique.com.guineehitmusic1;

import java.util.ArrayList;
import java.util.List;

import com.guineehitmusique.com.guineehitmusic1.drawer.NavItem;
import com.guineehitmusique.com.guineehitmusic1.fav.ui.FavFragment;

import com.guineehitmusique.com.guineehitmusic1.providers.twi.ui.TweetsFragment;
import com.guineehitmusique.com.guineehitmusic1.providers.wordpress.ui.WordpressFragment;
import com.guineehitmusique.com.guineehitmusic1.providers.facebook.FacebookFragment;

public class Config {

    //To open links in the WebView or outside the WebView.
    public static final boolean OPEN_EXPLICIT_EXTERNAL = true;
    public static final boolean OPEN_INLINE_EXTERNAL = false;

    //To open videos in our Local player or outside the local player
    public static final boolean PLAY_EXTERNAL = false;

    //To use a modern drawer (overlaying toolbar) with header image
    public static final boolean USE_NEW_DRAWER = false;

    //Wordpress perma-friendly API requests (JSON API)
    public static final boolean USE_WP_FRIENDLY = true;

    //If ads are enabled, also show them on the youtube layout
    public static final boolean ADMOB_YOUTUBE = false;

	public static List<NavItem> configuration() {

		List<NavItem> i = new ArrayList<NavItem>();

		//DONT MODIFY ABOVE THIS LINE

        //Some sample content is added below, please refer to your documentation for more information about configuring this file properly
        i.add(new NavItem("HOME", NavItem.SECTION));
        i.add(new NavItem("LATEST", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "", "http://androidpolice.disqus.com/;androidpolice;%d http://www.androidpolice.com/?p=%d"}));

        i.add(new NavItem("NEWS SECTION", NavItem.SECTION));
        i.add(new NavItem("ACCUEIL", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "actualite"}));
        i.add(new NavItem("AFRIQUE", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "afrique"}));
        i.add(new NavItem("PEOPLE", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "people"}));

        i.add(new NavItem("SONS SECTION", NavItem.SECTION));
        i.add(new NavItem("SONS", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "sons"}));
        i.add(new NavItem("TOP 100", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "top-100-sons-guineenne"}));
        i.add(new NavItem("HIT URBAN", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "hit-urban"}));
        i.add(new NavItem("HIT VARIATE", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "actualite"}));
        i.add(new NavItem("HIT FOUTA", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "hit-fouta"}));
        i.add(new NavItem("PLAYLIST", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "playlist"}));
        i.add(new NavItem("TOP 5", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "/top-hits"}));

        i.add(new NavItem("CLIPS SECTION", NavItem.SECTION));
        i.add(new NavItem("CLIPS", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "clips-guineenne"}));

        i.add(new NavItem("TELECHARGER SECTION", NavItem.SECTION));
        i.add(new NavItem("TELECHARGER", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "telecharger"}));

        i.add(new NavItem("PLUS SECTION", NavItem.SECTION));
        i.add(new NavItem("CONCERTS",0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "concerts"}));
        i.add(new NavItem("DECOUVERT", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "decouvert"}));
        i.add(new NavItem("PHOTO", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "photo"}));
        i.add(new NavItem("RETOUR AU SOURCE", 0, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://www.guineehitmusique.com/", "retour-au-source"}));
        i.add(new NavItem("Social Media", NavItem.SECTION));
        i.add(new NavItem("TWITTER", R.drawable.ic_twitter, NavItem.ITEM, TweetsFragment.class,
                new String[]{"GUINEEHITMUSIC"}));
        i.add(new NavItem("FACEBOOK", R.drawable.ic_facebook, NavItem.ITEM, FacebookFragment.class,
                new String[]{"161969180582129"}));

        i.add(new NavItem("CONTACT US", NavItem.SECTION));
        i.add(new NavItem("Contact", R.drawable.ic_details, NavItem.ITEM, CustomIntent.class, new String[]{"mailto:contact@guineehitmusique.com", CustomIntent.OPEN_URL}));
        //It's suggested to not change the content below this line

        i.add(new NavItem("Device", NavItem.SECTION));
        i.add(new NavItem("Favorites", R.drawable.ic_action_favorite, NavItem.EXTRA, FavFragment.class, null));
        i.add(new NavItem("Settings", R.drawable.ic_action_settings, NavItem.EXTRA, SettingsFragment.class, null));


        //DONT MODIFY BELOW THIS LINE

        return i;

	}

}