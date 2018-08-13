package com.wr.datpt.contactbeta.Controller;

import android.util.Log;

/**
 * Created by DatPT on 04/07/2018.
 */

public class ConvertContact {

    public String  convertAheadNumber(String phoneNumber){

        String oldNumber = "";
        String newNumber = "";
        if (phoneNumber.startsWith("+84 162") || phoneNumber.startsWith("+84162")
                || phoneNumber.startsWith("0162")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 162")){
                 oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84162")){
                 oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0162")){
                 oldNumber = phoneNumber.substring(4);
            }
            String newHead = "032";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 163") || phoneNumber.startsWith("+84163")
                || phoneNumber.startsWith("0163")){


            if (phoneNumber.startsWith("+84 163")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84163")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0163")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "033";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 164") || phoneNumber.startsWith("+84164")
                || phoneNumber.startsWith("0164")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 164")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84164")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0164")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "034";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 165") || phoneNumber.startsWith("+84165")
                || phoneNumber.startsWith("0165")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 165")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84165")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0165")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "035";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 166") || phoneNumber.startsWith("+84166")
                || phoneNumber.startsWith("0166")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 166")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84166")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0166")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "036";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 167") || phoneNumber.startsWith("+84167")
                || phoneNumber.startsWith("0167")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 167")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84167")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0167")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "037";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 168") || phoneNumber.startsWith("+84168")
                || phoneNumber.startsWith("0168")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 168")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84168")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0168")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "038";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 169") || phoneNumber.startsWith("+84169")
                || phoneNumber.startsWith("0169")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 169")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84169")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0169")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "039";
            newNumber = newHead.concat(oldNumber);
        }

        // mobifone

        if (phoneNumber.startsWith("+84 120") || phoneNumber.startsWith("+84120")
                || phoneNumber.startsWith("0120")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 120")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84120")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0120")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "070";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 121") || phoneNumber.startsWith("+84121")
                || phoneNumber.startsWith("0121")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 121")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84121")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0121")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "079";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 122") || phoneNumber.startsWith("+84122")
                || phoneNumber.startsWith("0122")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 122")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84122")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0122")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "077";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 126") || phoneNumber.startsWith("+84126")
                || phoneNumber.startsWith("0126")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 126")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84126")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0126")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "076";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 128") || phoneNumber.startsWith("+84128")
                || phoneNumber.startsWith("0128")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 128")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84128")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0128")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "078";
            newNumber = newHead.concat(oldNumber);
        }

        //vina

        if (phoneNumber.startsWith("+84 123") || phoneNumber.startsWith("+84123")
                || phoneNumber.startsWith("0123")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 123")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84123")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0123")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "083";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 124") || phoneNumber.startsWith("+84124")
                || phoneNumber.startsWith("0124")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 124")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84124")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0124")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "084";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 125") || phoneNumber.startsWith("+84125")
                || phoneNumber.startsWith("0125")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 125")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84125")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0125")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "085";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 127") || phoneNumber.startsWith("+84127")
                || phoneNumber.startsWith("0127")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 127")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84127")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0127")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "081";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 129") || phoneNumber.startsWith("+84129")
                || phoneNumber.startsWith("0129")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 129")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84129")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0129")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "082";
            newNumber = newHead.concat(oldNumber);
        }

        ///Vietnammoblie

        if (phoneNumber.startsWith("+84 186") || phoneNumber.startsWith("+84186")
                || phoneNumber.startsWith("0186")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 186")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84186")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0186")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "056";
            newNumber = newHead.concat(oldNumber);
        }
        if (phoneNumber.startsWith("+84 188") || phoneNumber.startsWith("+8418")
                || phoneNumber.startsWith("0188")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 188")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84188")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0188")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "058";
            newNumber = newHead.concat(oldNumber);
        }

        //Gmoble
        if (phoneNumber.startsWith("+84 199") || phoneNumber.startsWith("+84199")
                || phoneNumber.startsWith("0199")){
            Log.d("phnoe: ", phoneNumber);

            if (phoneNumber.startsWith("+84 199")){
                oldNumber = phoneNumber.substring(7);
            }
            if (phoneNumber.startsWith("+84199")){
                oldNumber = phoneNumber.substring(6);
            }
            if (phoneNumber.startsWith("0199")){
                oldNumber = phoneNumber.substring(4);
            }
            String newHead = "059";
            newNumber = newHead.concat(oldNumber);
        }
        return newNumber;
    }
}
