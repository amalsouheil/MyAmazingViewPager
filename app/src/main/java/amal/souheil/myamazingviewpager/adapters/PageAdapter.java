package amal.souheil.myamazingviewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import amal.souheil.myamazingviewpager.controllers.fragments.NewsPageFragment;
import amal.souheil.myamazingviewpager.controllers.fragments.PageFragment;
import amal.souheil.myamazingviewpager.controllers.fragments.ParamPageFragment;
import amal.souheil.myamazingviewpager.controllers.fragments.ProfilePageFragment;

/**
 * Created by Souheil Amal on 2019-02-06
 */
public class PageAdapter extends FragmentPagerAdapter {


    // 1 - Array of colors that will be passed to PageFragment
    //private int[] colors; car ona déja les déclaré directement dans le layout

    // 2 - Default Constructor
    //Default Constructor
    public PageAdapter(FragmentManager mgr) {
        super(mgr);
        // this.colors = colors;
    }


// Nous modifions également le nombre de pages (fragments) que l'on souhaite afficher dans notre ViewPager.
    @Override
    public int getCount() {
        return(3); // 3 - Number of page to show
    }

    //La méthode getItem( ) sera appelée dès qu'une page (fragment) demandera à être affichée.
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: //Page number 1
                return NewsPageFragment.newInstance();
            case 1: //Page number 2
                return ProfilePageFragment.newInstance();
            case 2: //Page number 3
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    //La méthode getPageTitle( ) a spécialement été conçue pour
    // retourner le titre de chacune des pages d'un ViewPager.
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: //Page number 1
                return "Fil d'actualité";
            case 1: //Page number 2
                return "Profil";
            case 2: //Page number 3
                return "Paramètre";
            default:
                return null;
        }
    }


}
