package org.lineageos.internal.util;

import android.content.Context;

public class ScreenType {
    public static boolean isTablet(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }
}
