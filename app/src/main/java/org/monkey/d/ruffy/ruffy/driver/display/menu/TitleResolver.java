package org.monkey.d.ruffy.ruffy.driver.display.menu;

/**
 * Created by fishermen21 on 22.05.17.
 */

class TitleResolver {
    public static Title resolve(String title) {

        /**english titles**/
        if(title.equalsIgnoreCase("bolus amount"))
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("immediate bolus"))
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("bolus duration"))
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info"))
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolus data"))
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("error data"))
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("daily totals"))
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("tbr data"))
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("tbr percentage"))
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("tbr duration"))
            return Title.TBR_DURATION;

        /**german titles**/
        if(title.equalsIgnoreCase("bolus-menge"))
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("sofortige abgabe"))
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("abgabedauer"))
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info"))
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolusinformation"))
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("fehlermeldungen"))
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("tagesgesamtmenge"))
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("tbr-information"))
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("tbr wert"))
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("tbr dauer"))
            return Title.TBR_DURATION;

        /**French titles**/
        if(title.equalsIgnoreCase("quantit?? bolus"))
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("quanti. imm??diate"))
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("dur??e du bolus"))
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info"))
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolus"))
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("erreurs"))
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("quantit??s journ."))
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("dbt"))
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("valeur du dbt"))
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("dur??e du dbt"))
            return Title.TBR_DURATION;


        /**spanish titles**/
        if(title.equalsIgnoreCase("cantidad de bolo"))
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("bolo inmediato"))
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("duraci??n de bolo"))
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info"))
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("datos de bolo"))
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("datos de error"))
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("totales diarios"))
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("datos de dbt"))
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("porcentaje dbt"))
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("duraci??n de dbt"))
            return Title.TBR_DURATION;


        /**italian titles**/
        if(title.equalsIgnoreCase("quantita bolo")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("bolo immediato")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("tempo erogazione")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("memoria boli")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("memoria allarmi")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("totali giornata")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("memoria pbt")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("percentuale pbt")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("durata pbt")) //TBR 2
            return Title.TBR_DURATION;

        /**dutch titles**/
        if(title.equalsIgnoreCase("bolushoeveelheid")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("directe bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("bolusduur")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolusgegevens")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("foutengegevens")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("dagtotalen")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("tbd-gegevens")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("tbd-percentage")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("tbd-duur")) //TBR 2
            return Title.TBR_DURATION;

        /**norwegian titles**/
        if(title.equalsIgnoreCase("bolusmengde")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("umiddelbar bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("bolusvarighet")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolusdata")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("feildata")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("d??gnmengde")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("mbd-data")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("mbd-prosent")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("mbd-varighet")) //TBR 2
            return Title.TBR_DURATION;

        /**polish titles**/
        if(title.equalsIgnoreCase("wielko???? bolusa")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("bolus natychm.")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("cz. trw. bolusa")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("dane bolusa")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("dane b????du")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("dzien. d. ca??k.")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("dane tdp")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("procent tdp")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("czas trwania tdp")) //TBR 2
            return Title.TBR_DURATION;

        /**cz titles**/
        if(title.equalsIgnoreCase("mno??stv?? bolusu")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("okam??it?? bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("trv??n?? bolusu")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("??daje bolus??")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("??daje chyb")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("celk. den. d??vky")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("??daje dbd")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("procento dbd")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("trv??n?? dbd")) //TBR 2
            return Title.TBR_DURATION;

        /**finnish titles**/
        if(title.equalsIgnoreCase("boluksen m????r??")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("nopea bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("boluksen kesto")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolustiedot")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("h??lytystiedot")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("p??iv. kok.annos")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("tba - tiedot")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("tba - prosentti")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("tba - kesto")) //TBR 2
            return Title.TBR_DURATION;

        /**turkish titles**/
        if(title.equalsIgnoreCase("bolus m??ktari")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("hemen bolus uygl")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("bolus s??res??")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolus ver??ler??")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("hata ver??ler??")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("g??nl??k toplam")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("gbh ver??ler??")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("gbh y??zdes??")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("gbh s??res??")) //TBR 2
            return Title.TBR_DURATION;

        /**romanian titles**/
        if(title.equalsIgnoreCase("cantitate bolus")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("bolus imediat")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("durat?? bolus")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("date bolus")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("date eroare")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("totaluri zilnice")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("date rbt")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("procent rbt")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("durata rbt")) //TBR 2
            return Title.TBR_DURATION;

        /**swedish titles**/
        if(title.equalsIgnoreCase("bolusm??ngd")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("direkt bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("bolusduration")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolusdata")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("feldata")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("dygnshistorik")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("tbd data")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("tbd procent")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("tbd duration")) //TBR 2
            return Title.TBR_DURATION;


        /**danish titles**/
        if(title.equalsIgnoreCase("bolusm??ngde")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("umiddelbar bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("bolusvarighed")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolusdata")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("fejldata")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("daglig total")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("mbr-data")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("mbr-procent")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("mbr-varighed")) //TBR 2
            return Title.TBR_DURATION;

        /**hungarian titles**/
        if(title.equalsIgnoreCase("b??lusmennyis??g")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("azonnali b??lus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("b??lus id??tartam")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("b??lusadatok")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("hibaadatok")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("napi teljes")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("tbr-adatok")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("tbr sz??zal??k")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("tbr id??tartam")) //TBR 2
            return Title.TBR_DURATION;


        /**slovak titles**/
        if(title.equalsIgnoreCase("mno??stvo bolusu")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("okam??it?? bolus")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("trvanie bolusu")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("bolusov?? d??ta")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("d??ta o chyb??ch")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("s????ty d??a")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("dbd d??ta")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("percento dbd")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("trvanie dbd")) //TBR 2
            return Title.TBR_DURATION;

        /**portugues titles**/
        if(title.equalsIgnoreCase("volume do bolus")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("bolus imediato")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("dura????o do bolus")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("dados de bolus")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("dados de erros")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("totais di??rios")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("dados dbt")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("dbt percentagem")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("dbt dura????o")) //TBR 2
            return Title.TBR_DURATION;


        /**russian titles**/
        if(title.equalsIgnoreCase("O????E?? ??O????C??")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("??P????O?? ??O????C")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("??PO??O????. ??O????C??")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("????HH??E O ??O????CE")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("????HH??E O?? O ????.")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("C??TO??H??E ??O????")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("????HH??E O B??C")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("??PO??EHT B??C")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("??PO??O??????T. B??C")) //TBR 2
            return Title.TBR_DURATION;

        /**croatian titles**/
        if(title.equalsIgnoreCase("KOLI??INA BOLUSA")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("TRENUTNI BOLUS")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("TRAJANJE BOLUSA")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("PODACI O BOLUSU")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("PODACI O GRE??K.")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("UKUPNE DNEV.DOZE")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("PODACI O PBD-u")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("POSTOTAK PBD-a")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("TRAJANJE PBD-a")) //TBR 2
            return Title.TBR_DURATION;

        /**greek titles**/
        if(title.equalsIgnoreCase("??O??OTHT?? ??O??H??")) //multiwave 1
            return Title.BOLUS_AMOUNT;
        if(title.equalsIgnoreCase("????E??H ??O??H")) //multiwave 2
            return Title.IMMEDIATE_BOLUS;
        if(title.equalsIgnoreCase("??I??PKEI?? ??O??H??")) //multiwave 3
            return Title.BOLUS_DURATION;
        if(title.equalsIgnoreCase("quick info")) //check1
            return Title.QUICK_INFO;
        if(title.equalsIgnoreCase("??E??O??EN?? ??O??E??N")) //check2, mydata 1
            return Title.BOLUS_DATA;
        if(title.equalsIgnoreCase("??E??O??. ????????????T??N")) //mydata 2
            return Title.ERROR_DATA;
        if(title.equalsIgnoreCase("H??EPH??IO ????NO??O")) //mydata 3
            return Title.DAILY_TOTALS;
        if(title.equalsIgnoreCase("??E??O??EN?? ??.B.P.")) //mydata 4
            return Title.TBR_DATA;
        if(title.equalsIgnoreCase("??O??O??TO ??.B.P.")) //TBR 1
            return Title.TBR_SET;
        if(title.equalsIgnoreCase("??I??PKEI?? ??.B.P.")) //TBR 2
            return Title.TBR_DURATION;

        // some pumps came preconfigured with a different quick info name
        if (title.equalsIgnoreCase("accu chek spirit"))
            return Title.QUICK_INFO;

        //FIXME add Translations
        return null;
    }
}
