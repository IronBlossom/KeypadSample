package com.napcosecurity.android.rcm.ui.panels;

import android.support.annotation.IdRes;
import android.util.SparseArray;

import com.napcosecurity.android.rcm.ui.R;


/**
 * Created by imamin on 2/24/2016.
 */
public final class KeyDefs {
    private static final SparseArray<byte[]> KEYMAP = new SparseArray<>();

    //region Key values
    static {
      /*DSC*/
        KEYMAP.put(R.id.dsc_zero, new byte[]{0x00});
        KEYMAP.put(R.id.dsc_one, new byte[]{0x01});
        KEYMAP.put(R.id.dsc_two, new byte[]{0x02});
        KEYMAP.put(R.id.dsc_three, new byte[]{0x03});
        KEYMAP.put(R.id.dsc_four, new byte[]{0x04});
        KEYMAP.put(R.id.dsc_five, new byte[]{0x05});
        KEYMAP.put(R.id.dsc_six, new byte[]{0x06});
        KEYMAP.put(R.id.dsc_seven, new byte[]{0x07});
        KEYMAP.put(R.id.dsc_eight, new byte[]{0x08});
        KEYMAP.put(R.id.dsc_nine, new byte[]{0x09});
        KEYMAP.put(R.id.dsc_asteriskSign, new byte[]{0x0a});
        KEYMAP.put(R.id.dsc_numberSign, new byte[]{0x0b});
        KEYMAP.put(R.id.dsc_med, new byte[]{0x10});
        KEYMAP.put(R.id.dsc_aux, new byte[]{0x11});
        KEYMAP.put(R.id.dsc_fire, new byte[]{0x12});
        KEYMAP.put(R.id.dsc_stay, new byte[]{0x13});
        KEYMAP.put(R.id.dsc_away, new byte[]{0x14});
        KEYMAP.put(R.id.dsc_chime, new byte[]{0x15});
        KEYMAP.put(R.id.dsc_reset, new byte[]{0x16});
        KEYMAP.put(R.id.dsc_quickexit, new byte[]{0x17});
        KEYMAP.put(R.id.dsc_arrow_right, new byte[]{0x18});
        KEYMAP.put(R.id.dsc_arrow_left, new byte[]{0x19});

        /*HONEYWELL*/
        KEYMAP.put(R.id.honeywell_zero, new byte[]{0x00});
        KEYMAP.put(R.id.honeywell_one, new byte[]{0x01});
        KEYMAP.put(R.id.honeywell_two, new byte[]{0x02});
        KEYMAP.put(R.id.honeywell_three, new byte[]{0x03});
        KEYMAP.put(R.id.honeywell_four, new byte[]{0x04});
        KEYMAP.put(R.id.honeywell_five, new byte[]{0x05});
        KEYMAP.put(R.id.honeywell_six, new byte[]{0x06});
        KEYMAP.put(R.id.honeywell_seven, new byte[]{0x07});
        KEYMAP.put(R.id.honeywell_eight, new byte[]{0x08});
        KEYMAP.put(R.id.honeywell_nine, new byte[]{0x09});
        KEYMAP.put(R.id.honeywell_asteriskSign, new byte[]{0x0a});
        KEYMAP.put(R.id.honeywell_numberSign, new byte[]{0x0b});
        KEYMAP.put(R.id.honeywell_A, new byte[]{0x0c});
        KEYMAP.put(R.id.honeywell_B, new byte[]{0x0d});
        KEYMAP.put(R.id.honeywell_C, new byte[]{0x0e});
        KEYMAP.put(R.id.honeywell_D, new byte[]{0x0f});
        KEYMAP.put(R.id.honeywell_med, new byte[]{0x10});
        KEYMAP.put(R.id.honeywell_aux, new byte[]{0x11});
        KEYMAP.put(R.id.honeywell_fire, new byte[]{0x12});
    }
    //endregion

    //region Keypad type
    static {
        KEYMAP.put(R.id.keypadtype_dsc, new byte[]{0x5f});
        KEYMAP.put(R.id.keypadtype_honeywell, new byte[]{0x6f});
    }
    //endregion

    //region Packet87Type
    static {
        KEYMAP.put(R.id.pkt87type_s_passthru, new byte[]{(byte) 0x80});
        KEYMAP.put(R.id.pkt87type_passthru, new byte[]{(byte) 0x00});
        KEYMAP.put(R.id.pkt87type_end_passthru, new byte[]{(byte) 0x02});
    }
    //endregion

    //region Disconnect Reason
    static {
        KEYMAP.put(R.id.rcm_disconnect_reason_report, new byte[]{0x01});
        KEYMAP.put(R.id.rcm_disconnect_reason_checkinto, new byte[]{0x02});
    }
    //endregion

    //region Security Code
    static {
        KEYMAP.put(R.id.security_code, new byte[]{0x01, 0x02, 0x03});
    }
    //endregion

    public static byte[] getVal(@IdRes int id) {
        return KEYMAP.get(id);
    }

}


