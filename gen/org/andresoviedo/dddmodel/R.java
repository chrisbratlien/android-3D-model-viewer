/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package org.andresoviedo.dddmodel;

public final class R {
    public static final class array {
        public static final int menu_items=0x7f0a0000;
    }
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f090000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f060002;
        public static final int activity_vertical_margin=0x7f060003;
        public static final int list_item_padding=0x7f060001;
        public static final int list_padding=0x7f060000;
    }
    public static final class drawable {
        public static final int ic_chooser=0x7f020000;
        public static final int ic_file=0x7f020001;
        public static final int ic_folder=0x7f020002;
        public static final int ic_launcher=0x7f020003;
    }
    public static final class id {
        public static final int action_settings=0x7f0c0007;
        public static final int activity_menu_item=0x7f0c0000;
        public static final int dummy_button=0x7f0c0003;
        public static final int explorer_fragment=0x7f0c0004;
        public static final int file_icon=0x7f0c0005;
        public static final int file_name=0x7f0c0006;
        public static final int fullscreen_content=0x7f0c0001;
        public static final int fullscreen_content_controls=0x7f0c0002;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int activity_menu=0x7f030001;
        public static final int activity_menu_item=0x7f030002;
        public static final int activity_model=0x7f030003;
        public static final int activity_view_model=0x7f030004;
        public static final int chooser=0x7f030005;
        public static final int file=0x7f030006;
    }
    public static final class menu {
        public static final int main=0x7f0b0000;
        public static final int menu=0x7f0b0001;
        public static final int model=0x7f0b0002;
    }
    public static final class raw {
        public static final int ic_launcher=0x7f050000;
    }
    public static final class string {
        public static final int action_settings=0x7f070006;
        public static final int app_logo_desc=0x7f070009;
        public static final int app_name=0x7f070004;
        public static final int app_version=0x7f070005;
        public static final int choose_file=0x7f070002;
        public static final int dummy_button=0x7f07000b;
        public static final int dummy_content=0x7f07000c;
        public static final int empty_directory=0x7f070000;
        public static final int error_selecting_file=0x7f070003;
        public static final int hello_world=0x7f070007;
        public static final int storage_removed=0x7f070001;
        public static final int title_activity_menu=0x7f070008;
        public static final int title_activity_model=0x7f07000d;
        public static final int title_activity_view_model=0x7f07000a;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f080002;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f080003;
        public static final int ButtonBar=0x7f080005;
        public static final int ButtonBarButton=0x7f080006;
        public static final int FullscreenActionBarStyle=0x7f080007;
        public static final int FullscreenTheme=0x7f080004;
        public static final int fileChooserIcon=0x7f080001;
        public static final int fileChooserName=0x7f080000;
    }
    public static final class xml {
        public static final int mimetypes=0x7f040000;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle org.andresoviedo.dddmodel:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle org.andresoviedo.dddmodel:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link org.andresoviedo.dddmodel.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name org.andresoviedo.dddmodel:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link org.andresoviedo.dddmodel.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name org.andresoviedo.dddmodel:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
