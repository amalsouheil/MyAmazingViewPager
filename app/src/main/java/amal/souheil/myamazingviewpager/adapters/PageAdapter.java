package amal.souheil.myamazingviewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import amal.souheil.myamazingviewpager.controllers.fragments.PageFragment;

/**
 * Created by Souheil Amal on 2019-02-06
 */
public class PageAdapter extends FragmentPagerAdapter {


    // 1 - Array of colors that will be passed to PageFragment
    private int[] colors;

    // 2 - Default Constructor
    public PageAdapter(FragmentManager mgr, int[] colors) {
        super(mgr);
        this.colors = colors;
    }
// Nous modifions également le nombre de pages (fragments) que l'on souhaite afficher dans notre ViewPager.
    @Override
    public int getCount() {
        return(6); // 3 - Number of page to show
    }

    //La méthode getItem( ) sera appelée dès qu'une page (fragment) demandera à être affichée.
    @Override
    public Fragment getItem(int position) {
        // 4 - Page to return
        return(PageFragment.newInstance(position, this.colors[position]));
    }
}
