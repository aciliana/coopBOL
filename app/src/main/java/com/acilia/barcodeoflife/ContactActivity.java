package com.acilia.barcodeoflife;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by alicia on 2015-07-06.
 */
public class ContactActivity extends ActionBarActivity {
    Button mon2, tue2, tue3, tue4, tue5, tue6, tue7, tue8, tue9, tue10, tue, tuee, tueee, tueeee;
    Button mon21, mon22, mon23, tue21, tue22, tue23, tue24, tue25, tue26, tue31, tue32, tue33, tue34, tue35, tue36, tue41, tue42, tue43, tue44, tue45, tue46, tue51, tue52, tue53, tue54, tue55, tue56, tue61, tue62, tue63, tue64, tue71, tue72, tue73, tue74, tue75, tue81, tue82, tue83, tue84, tue85, tue86, tue91, tue92, tue93, tue94, tue95, tue96, tue101, tue102, tue103, tue104, tue105, tue106, tue107, tue108, tue121, tue112, tue113, tue114, tue115, tue131, tue122, tue123, tue124, tue125, tue126, tue141, tue132, tue133, tue134, tue135, tue136, tue151, tue142, tue143, tue144, tue145, tue146;
    Boolean m1 = false, tue1 = false, tue11 = false, tue111 = false, tue1111 = false, tue11111 = false, tue0 = false, tue00 = false, tue000 = false, tue0000 = false, tue00000 = false, tue22222 = false, tue000000 = false, tue111111 = false;
    Boolean mt1 = false, mt2 = false, mt3 = false, tt1 = false, tt2 = false, tt3 = false, tt4 = false, tt5 = false, tt6 = false, tt11 = false, tt12 = false, tt13 = false, tt14 = false, tt15 = false, tt16 = false, tt21 = false, tt22 = false, tt23 = false, tt24 = false, tt25 = false, tt26 = false, tt31 = false, tt32 = false, tt33 = false, tt34 = false, tt35 = false, tt36 = false, tt41 = false, tt42 = false, tt43 = false, tt44 = false, tt111 = false, tt112 = false, tt113 = false, tt114 = false, tt115 = false, tt116 = false;
    Boolean tt51 = false, tt52 = false, tt53 = false, tt54 = false, tt55 = false, tt61 = false, tt62 = false, tt63 = false, tt64 = false, tt65 = false, tt66 = false, tt71 = false, tt72 = false, tt73 = false, tt74 = false, tt75 = false, tt76 = false, tt81 = false, tt82 = false, tt83 = false, tt84 = false, tt85 = false, tt86 = false, tt87 = false, tt88 = false, tt91 = false, tt92 = false, tt93 = false, tt94 = false, tt95 = false, tt101 = false, tt102 = false, tt103 = false, tt104 = false, tt105 = false, tt106 = false, tt121 = false, tt122 = false, tt123 = false, tt124 = false, tt125 = false, tt126 = false;
    TextView t1, t2, t3, u1, u2, u3, u4, u5, u6, u11, u12, u13, u14, u15, u16, u21, u22, u23, u24, u25, u26, u31, u32, u33, u34, u35, u36, u41, u42, u43, u44, u51, u52, u53, u54, u55, u61, u62, u63, u64, u65, u66, u71, u72, u73, u74, u75, u76, u81, u82, u83, u84, u85, u86, u87, u88, u91, u92, u93, u94, u95, u101, u102, u103, u104, u105, u106, u111, u112, u113, u114, u115, u116, u121, u122, u123, u124, u125, u126;

    Button wed2, wed3, wed4, wed5, wed6, wed7, wed8;
    Button wed21, wed22, wed23, wed24, wed25, wed26, wed31, wed32, wed33, wed34, wed35, wed36, wed41, wed42, wed43, wed44, wed45, wed46, wed51, wed52, wed53, wed54, wed55, wed56, wed61, wed62, wed63, wed64, wed65, wed66, wed71, wed72, wed73, wed74, wed75, wed76, wed81, wed82, wed83, wed84, wed85, wed86;
    Boolean w1 = false, w2 = false, w3 = false, w4 = false, w5 = false, w6 = false, w7 = false;
    Boolean wt1 = false, wt2 = false, wt3 = false, wt4 = false, wt5 = false, wt6 = false, wt11 = false, wt12 = false, wt13 = false, wt14 = false, wt15 = false, wt16 = false, wt21 = false, wt22 = false, wt23 = false, wt24 = false, wt25 = false, wt26 = false, wt31 = false, wt32 = false, wt33 = false, wt34 = false, wt35 = false, wt36 = false, wt41 = false, wt42 = false, wt43 = false, wt44 = false, wt45 = false, wt46 = false, wt51 = false, wt52 = false, wt53 = false, wt54 = false, wt55 = false, wt56 = false, wt61 = false, wt62 = false, wt63 = false, wt64 = false, wt65 = false, wt66 = false;
    TextView v1, v2, v3, v4, v5, v6, v11, v12, v13, v14, v15, v16, v21, v22, v23, v24, v25, v26, v31, v32, v33, v34, v35, v36, v41, v42, v43, v44, v45, v46, v51, v52, v53, v54, v55, v56, v61, v62, v63, v64, v65, v66;

    Button thur2, thur3, thur4, thur5, thur6, thur7, thur8, thur9, thur10, thur11, thur12, thur13, thur14;
    Button thur21, thur22, thur23, thur24, thur25, thur26, thur31, thur32, thur33, thur34, thur35, thur36, thur41, thur42, thur43, thur44, thur45, thur51, thur52, thur53, thur54, thur55, thur56, thur61, thur62, thur63, thur64, thur65, thur66, thur71, thur72, thur73, thur74, thur75, thur76, thur81, thur82, thur83, thur84, thur85, thur86, thur91, thur92, thur93, thur94, thur95, thur96, thur101, thur102, thur103, thur104, thur105, thur106, thur111, thur112, thur113, thur114, thur115, thur116, thur121, thur122, thur123, thur124, thur125, thur126, thur131, thur132, thur133, thur134, thur135, thur136, thur141, thur142, thur143, thur144, thur145, thur146;
    Boolean th1 = false, th2 = false, th3 = false, th4 = false, th5 = false, th6 = false, th7 = false, th8 = false, th9 = false, th10 = false, th11 = false, th12 = false, th13 = false;
    Boolean tht1 = false, tht2 = false, tht3 = false, tht4 = false, tht5 = false, tht6 = false, tht11 = false, tht12 = false, tht13 = false, tht14 = false, tht15 = false, tht16 = false, tht21 = false, tht22 = false, tht23 = false, tht24 = false, tht25 = false, tht31 = false, tht32 = false, tht33 = false, tht34 = false, tht35 = false, tht36 = false, tht41 = false, tht42 = false, tht43 = false, tht44 = false, tht45 = false, tht46 = false;
    Boolean tht51 = false, tht52 = false, tht53 = false, tht54 = false, tht55 = false, tht56 = false, tht61 = false, tht62 = false, tht63 = false, tht64 = false, tht65 = false, tht66 = false, tht71 = false, tht72 = false, tht73 = false, tht74 = false, tht75 = false, tht76 = false, tht81 = false, tht82 = false, tht83 = false, tht84 = false, tht85 = false, tht86 = false, tht91 = false, tht92 = false, tht93 = false, tht94 = false, tht95 = false, tht96 = false;
    Boolean tht101 = false, tht102 = false, tht103 = false, tht104 = false, tht105 = false, tht106 = false, tht111 = false, tht112 = false, tht113 = false, tht114 = false, tht115 = false, tht116 = false, tht121 = false, tht122 = false, tht123 = false, tht124 = false, tht125 = false, tht126 = false;
    TextView y1, y2, y3, y4, y5, y6, y11, y12, y13, y14, y15, y16, y21, y22, y23, y24, y25, y31, y32, y33, y34, y35, y36, y41, y42, y43, y44, y45, y46, y51, y52, y53, y54, y55, y56, y61, y62, y63, y64, y65, y66, y71, y72, y73, y74, y75, y76, y81, y82, y83, y84, y85, y86, y91, y92, y93, y94, y95, y96, y101, y102, y103, y104, y105, y106, y111, y112, y113, y114, y115, y116, y121, y122, y123, y124, y125, y126;

    Button fri2, fri3, fri4, fri5, fri6, fri7, fri8;
    Button fri21, fri22, fri23, fri24, fri25, fri26, fri31, fri32, fri33, fri34, fri35, fri36, fri41, fri42, fri43, fri44, fri45, fri46, fri51, fri52, fri53, fri54, fri55, fri56, fri61, fri62, fri63, fri64, fri65, fri66, fri71, fri72, fri73, fri74, fri75, fri81, fri82, fri83, fri84, fri85, fri86;
    Boolean f1 = false, f2 = false, f3 = false, f4 = false, f5 = false, f6 = false;
    Boolean ft1 = false, ft2 = false, ft3 = false, ft4 = false, ft5 = false, ft6 = false, ft11 = false, ft12 = false, ft13 = false, ft14 = false, ft15 = false, ft16 = false, ft21 = false, ft22 = false, ft23 = false, ft24 = false, ft25 = false, ft26 = false, ft31 = false, ft32 = false, ft33 = false, ft34 = false, ft35 = false, ft36 = false, ft41 = false, ft42 = false, ft43 = false, ft44 = false, ft45 = false, ft46 = false, ft51 = false, ft52 = false, ft53 = false, ft54 = false, ft55 = false;
    Boolean ft61 = false, ft62 = false, ft63 = false, ft64 = false, ft65 = false, ft66 = false;
    TextView z1, z2, z3, z4, z5, z6, z11, z12, z13, z14, z15, z16, z21, z22, z23, z24, z25, z26, z31, z32, z33, z34, z35, z36, z41, z42, z43, z44, z45, z46, z51, z52, z53, z54, z55, z61, z62, z63, z64, z65, z66;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        final TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec1 = tabHost.newTabSpec("tab1");
        spec1.setContent(R.id.t1);
        spec1.setIndicator("Mon", null);
        tabHost.addTab(spec1);

        TabHost.TabSpec spec2 = tabHost.newTabSpec("tab2");
        spec2.setContent(R.id.t2);
        spec2.setIndicator("Tue", null);
        tabHost.addTab(spec2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("tab3");
        spec3.setContent(R.id.t3);
        spec3.setIndicator("Wed", null);
        tabHost.addTab(spec3);

        TabHost.TabSpec spec4 = tabHost.newTabSpec("tab4");
        spec4.setContent(R.id.t4);
        spec4.setIndicator("Thur", null);
        tabHost.addTab(spec4);

        TabHost.TabSpec spec5 = tabHost.newTabSpec("tab5");
        spec5.setContent(R.id.t5);
        spec5.setIndicator("Fri", null);
        tabHost.addTab(spec5);
        //<------------------MONDAY---------------------->
        this.mon2 = (Button) findViewById(R.id.mon2);
        this.mon21 = (Button) findViewById(R.id.mon21);
        this.mon22 = (Button) findViewById(R.id.mon22);
        this.mon23 = (Button) findViewById(R.id.mon23);
        this.t1 = (TextView) findViewById(R.id.mont1);
        this.t2 = (TextView) findViewById(R.id.mont2);
        this.t3 = (TextView) findViewById(R.id.mont3);
        this.mon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m1 == false) {
                    mon21.setVisibility(View.VISIBLE);
                    mon21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (mt1 == false) {
                                t1.setVisibility(View.VISIBLE);
                                mt1 = true;
                            } else {
                                t1.setVisibility(View.GONE);
                                mt1 = false;
                            }
                        }
                    });
                    mon22.setVisibility(View.VISIBLE);
                    mon22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (mt2 == false) {
                                t2.setVisibility(View.VISIBLE);
                                mt2 = true;
                            } else {
                                t2.setVisibility(View.GONE);
                                mt2 = false;
                            }
                        }
                    });
                    mon23.setVisibility(View.VISIBLE);
                    mon23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (mt3 == false) {
                                t3.setVisibility(View.VISIBLE);
                                mt3 = true;
                            } else {
                                t3.setVisibility(View.GONE);
                                mt3 = false;
                            }
                        }
                    });
                    m1 = true;
                } else {
                    mon21.setVisibility(View.GONE);
                    mon22.setVisibility(View.GONE);
                    mon23.setVisibility(View.GONE);
                    t1.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);
                    t3.setVisibility(View.GONE);
                    m1 = false;
                }
            }
        });
        //<-----------------------Tuesday #1---------------------->
        this.tue2 = (Button) findViewById(R.id.tue2);
        this.tue21 = (Button) findViewById(R.id.tue21);
        this.tue22 = (Button) findViewById(R.id.tue22);
        this.tue23 = (Button) findViewById(R.id.tue23);
        this.tue24 = (Button) findViewById(R.id.tue24);
        this.tue25 = (Button) findViewById(R.id.tue25);
        this.tue26 = (Button) findViewById(R.id.tue26);
        this.u1 = (TextView) findViewById(R.id.tuet1);
        this.u2 = (TextView) findViewById(R.id.tuet2);
        this.u3 = (TextView) findViewById(R.id.tuet3);
        this.u4 = (TextView) findViewById(R.id.tuet4);
        this.u5 = (TextView) findViewById(R.id.tuet5);
        this.u6 = (TextView) findViewById(R.id.tuet6);
        this.tue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue1 == false) {
                    tue21.setVisibility(View.VISIBLE);
                    tue21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt1 == false) {
                                u1.setVisibility(View.VISIBLE);
                                tt1 = true;
                            } else {
                                u1.setVisibility(View.GONE);
                                tt1 = false;
                            }
                        }
                    });
                    tue22.setVisibility(View.VISIBLE);
                    tue22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt2 == false) {
                                u2.setVisibility(View.VISIBLE);
                                tt2 = true;
                            } else {
                                u2.setVisibility(View.GONE);
                                tt2 = false;
                            }
                        }
                    });
                    tue23.setVisibility(View.VISIBLE);
                    tue23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt3 == false) {
                                u3.setVisibility(View.VISIBLE);
                                tt3 = true;
                            } else {
                                u3.setVisibility(View.GONE);
                                tt3 = false;
                            }
                        }
                    });
                    tue24.setVisibility(View.VISIBLE);
                    tue24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt4 == false) {
                                u4.setVisibility(View.VISIBLE);
                                tt4 = true;
                            } else {
                                u4.setVisibility(View.GONE);
                                tt4 = false;
                            }
                        }
                    });
                    tue25.setVisibility(View.VISIBLE);
                    tue25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt5 == false) {
                                u5.setVisibility(View.VISIBLE);
                                tt5 = true;
                            } else {
                                u5.setVisibility(View.GONE);
                                tt5 = false;
                            }
                        }
                    });
                    tue26.setVisibility(View.VISIBLE);
                    tue26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt6 == false) {
                                u6.setVisibility(View.VISIBLE);
                                tt6 = true;
                            } else {
                                u6.setVisibility(View.GONE);
                                tt6 = false;
                            }
                        }
                    });
                    tue1 = true;
                } else {
                    tue21.setVisibility(View.GONE);
                    tue22.setVisibility(View.GONE);
                    tue23.setVisibility(View.GONE);
                    tue24.setVisibility(View.GONE);
                    tue25.setVisibility(View.GONE);
                    tue26.setVisibility(View.GONE);
                    u1.setVisibility(View.GONE);
                    u2.setVisibility(View.GONE);
                    u3.setVisibility(View.GONE);
                    u4.setVisibility(View.GONE);
                    u5.setVisibility(View.GONE);
                    u6.setVisibility(View.GONE);
                    tue1 = false;
                }
            }
        });
        //<------------------------Tuesday #2-------------------------->
        this.tue3 = (Button) findViewById(R.id.tue3);
        this.tue31 = (Button) findViewById(R.id.tue31);
        this.tue32 = (Button) findViewById(R.id.tue32);
        this.tue33 = (Button) findViewById(R.id.tue33);
        this.tue34 = (Button) findViewById(R.id.tue34);
        this.tue35 = (Button) findViewById(R.id.tue35);
        this.tue36 = (Button) findViewById(R.id.tue36);
        this.u11 = (TextView) findViewById(R.id.tuet11);
        this.u12 = (TextView) findViewById(R.id.tuet12);
        this.u13 = (TextView) findViewById(R.id.tuet13);
        this.u14 = (TextView) findViewById(R.id.tuet14);
        this.u15 = (TextView) findViewById(R.id.tuet15);
        this.u16 = (TextView) findViewById(R.id.tuet16);
        this.tue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue11 == false) {
                    tue31.setVisibility(View.VISIBLE);
                    tue31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt11 == false) {
                                u11.setVisibility(View.VISIBLE);
                                tt11 = true;
                            } else {
                                u11.setVisibility(View.GONE);
                                tt11 = false;
                            }
                        }
                    });
                    tue32.setVisibility(View.VISIBLE);
                    tue32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt12 == false) {
                                u12.setVisibility(View.VISIBLE);
                                tt12 = true;
                            } else {
                                u12.setVisibility(View.GONE);
                                tt12 = false;
                            }
                        }
                    });
                    tue33.setVisibility(View.VISIBLE);
                    tue33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt13 == false) {
                                u13.setVisibility(View.VISIBLE);
                                tt13 = true;
                            } else {
                                u13.setVisibility(View.GONE);
                                tt13 = false;
                            }
                        }
                    });
                    tue34.setVisibility(View.VISIBLE);
                    tue34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt14 == false) {
                                u14.setVisibility(View.VISIBLE);
                                tt14 = true;
                            } else {
                                u14.setVisibility(View.GONE);
                                tt14 = false;
                            }
                        }
                    });
                    tue35.setVisibility(View.VISIBLE);
                    tue35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt15 == false) {
                                u15.setVisibility(View.VISIBLE);
                                tt15 = true;
                            } else {
                                u15.setVisibility(View.GONE);
                                tt15 = false;
                            }
                        }
                    });
                    tue36.setVisibility(View.VISIBLE);
                    tue36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt16 == false) {
                                u16.setVisibility(View.VISIBLE);
                                tt16 = true;
                            } else {
                                u16.setVisibility(View.GONE);
                                tt16 = false;
                            }
                        }
                    });
                    tue11 = true;
                } else {
                    tue31.setVisibility(View.GONE);
                    tue32.setVisibility(View.GONE);
                    tue33.setVisibility(View.GONE);
                    tue34.setVisibility(View.GONE);
                    tue35.setVisibility(View.GONE);
                    tue36.setVisibility(View.GONE);
                    u11.setVisibility(View.GONE);
                    u12.setVisibility(View.GONE);
                    u13.setVisibility(View.GONE);
                    u14.setVisibility(View.GONE);
                    u15.setVisibility(View.GONE);
                    u16.setVisibility(View.GONE);
                    tue11 = false;
                }
            }
        });
        //<--------------------Tuesday #3-------------------->
        this.tue4 = (Button) findViewById(R.id.tue4);
        this.tue41 = (Button) findViewById(R.id.tue41);
        this.tue42 = (Button) findViewById(R.id.tue42);
        this.tue43 = (Button) findViewById(R.id.tue43);
        this.tue44 = (Button) findViewById(R.id.tue44);
        this.tue45 = (Button) findViewById(R.id.tue45);
        this.tue46 = (Button) findViewById(R.id.tue46);
        this.u21 = (TextView) findViewById(R.id.tuet21);
        this.u22 = (TextView) findViewById(R.id.tuet22);
        this.u23 = (TextView) findViewById(R.id.tuet23);
        this.u24 = (TextView) findViewById(R.id.tuet24);
        this.u25 = (TextView) findViewById(R.id.tuet25);
        this.u26 = (TextView) findViewById(R.id.tuet26);
        this.tue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue111 == false) {
                    tue41.setVisibility(View.VISIBLE);
                    tue41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt21 == false) {
                                u21.setVisibility(View.VISIBLE);
                                tt21 = true;
                            } else {
                                u21.setVisibility(View.GONE);
                                tt21 = false;
                            }
                        }
                    });
                    tue42.setVisibility(View.VISIBLE);
                    tue42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt22 == false) {
                                u22.setVisibility(View.VISIBLE);
                                tt22 = true;
                            } else {
                                u22.setVisibility(View.GONE);
                                tt22 = false;
                            }
                        }
                    });
                    tue43.setVisibility(View.VISIBLE);
                    tue43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt23 == false) {
                                u23.setVisibility(View.VISIBLE);
                                tt23 = true;
                            } else {
                                u23.setVisibility(View.GONE);
                                tt23 = false;
                            }
                        }
                    });
                    tue44.setVisibility(View.VISIBLE);
                    tue44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt24 == false) {
                                u24.setVisibility(View.VISIBLE);
                                tt24 = true;
                            } else {
                                u24.setVisibility(View.GONE);
                                tt24 = false;
                            }
                        }
                    });
                    tue45.setVisibility(View.VISIBLE);
                    tue45.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt25 == false) {
                                u25.setVisibility(View.VISIBLE);
                                tt25 = true;
                            } else {
                                u25.setVisibility(View.GONE);
                                tt25 = false;
                            }
                        }
                    });
                    tue46.setVisibility(View.VISIBLE);
                    tue46.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt26 == false) {
                                u26.setVisibility(View.VISIBLE);
                                tt26 = true;
                            } else {
                                u26.setVisibility(View.GONE);
                                tt26 = false;
                            }
                        }
                    });
                    tue111 = true;
                } else {
                    tue41.setVisibility(View.GONE);
                    tue42.setVisibility(View.GONE);
                    tue43.setVisibility(View.GONE);
                    tue44.setVisibility(View.GONE);
                    tue45.setVisibility(View.GONE);
                    tue46.setVisibility(View.GONE);
                    u21.setVisibility(View.GONE);
                    u22.setVisibility(View.GONE);
                    u23.setVisibility(View.GONE);
                    u24.setVisibility(View.GONE);
                    u25.setVisibility(View.GONE);
                    u26.setVisibility(View.GONE);
                    tue111 = false;
                }
            }
        });
        //<--------------------------Tuesday #4--------------------------->
        this.tue5 = (Button) findViewById(R.id.tue5);
        this.tue51 = (Button) findViewById(R.id.tue51);
        this.tue52 = (Button) findViewById(R.id.tue52);
        this.tue53 = (Button) findViewById(R.id.tue53);
        this.tue54 = (Button) findViewById(R.id.tue54);
        this.tue55 = (Button) findViewById(R.id.tue55);
        this.tue56 = (Button) findViewById(R.id.tue56);
        this.u31 = (TextView) findViewById(R.id.tuet31);
        this.u32 = (TextView) findViewById(R.id.tuet32);
        this.u33 = (TextView) findViewById(R.id.tuet33);
        this.u34 = (TextView) findViewById(R.id.tuet34);
        this.u35 = (TextView) findViewById(R.id.tuet35);
        this.u36 = (TextView) findViewById(R.id.tuet36);
        this.tue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue1111 == false) {
                    tue51.setVisibility(View.VISIBLE);
                    tue51.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt31 == false) {
                                u31.setVisibility(View.VISIBLE);
                                tt31 = true;
                            } else {
                                u31.setVisibility(View.GONE);
                                tt31 = false;
                            }
                        }
                    });
                    tue52.setVisibility(View.VISIBLE);
                    tue52.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt32 == false) {
                                u32.setVisibility(View.VISIBLE);
                                tt32= true;
                            } else {
                                u32.setVisibility(View.GONE);
                                tt32 = false;
                            }
                        }
                    });
                    tue53.setVisibility(View.VISIBLE);
                    tue53.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt33 == false) {
                                u33.setVisibility(View.VISIBLE);
                                tt33 = true;
                            } else {
                                u33.setVisibility(View.GONE);
                                tt33 = false;
                            }
                        }
                    });
                    tue54.setVisibility(View.VISIBLE);
                    tue54.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt34 == false) {
                                u34.setVisibility(View.VISIBLE);
                                tt34 = true;
                            } else {
                                u34.setVisibility(View.GONE);
                                tt34 = false;
                            }
                        }
                    });
                    tue55.setVisibility(View.VISIBLE);
                    tue55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt35 == false) {
                                u35.setVisibility(View.VISIBLE);
                                tt35 = true;
                            } else {
                                u35.setVisibility(View.GONE);
                                tt35 = false;
                            }
                        }
                    });
                    tue56.setVisibility(View.VISIBLE);
                    tue56.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt36 == false) {
                                u36.setVisibility(View.VISIBLE);
                                tt36 = true;
                            } else {
                                u36.setVisibility(View.GONE);
                                tt36 = false;
                            }
                        }
                    });
                    tue1111 = true;
                } else {
                    tue51.setVisibility(View.GONE);
                    tue52.setVisibility(View.GONE);
                    tue53.setVisibility(View.GONE);
                    tue54.setVisibility(View.GONE);
                    tue55.setVisibility(View.GONE);
                    tue56.setVisibility(View.GONE);
                    u31.setVisibility(View.GONE);
                    u32.setVisibility(View.GONE);
                    u33.setVisibility(View.GONE);
                    u34.setVisibility(View.GONE);
                    u35.setVisibility(View.GONE);
                    u36.setVisibility(View.GONE);
                    tue1111 = false;
                }
            }
        });
        //<------------------------Tuesday #5------------------------->
        this.tue6 = (Button) findViewById(R.id.tue6);
        this.tue61 = (Button) findViewById(R.id.tue61);
        this.tue62 = (Button) findViewById(R.id.tue62);
        this.tue63 = (Button) findViewById(R.id.tue63);
        this.tue64 = (Button) findViewById(R.id.tue64);
        this.u41 = (TextView) findViewById(R.id.tuet41);
        this.u42 = (TextView) findViewById(R.id.tuet42);
        this.u43 = (TextView) findViewById(R.id.tuet43);
        this.u44 = (TextView) findViewById(R.id.tuet44);
        this.tue6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue11111 == false) {
                    tue61.setVisibility(View.VISIBLE);
                    tue61.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt41 == false) {
                                u41.setVisibility(View.VISIBLE);
                                tt41 = true;
                            } else {
                                u41.setVisibility(View.GONE);
                                tt41 = false;
                            }
                        }
                    });
                    tue62.setVisibility(View.VISIBLE);
                    tue62.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt42 == false) {
                                u42.setVisibility(View.VISIBLE);
                                tt42 = true;
                            } else {
                                u42.setVisibility(View.GONE);
                                tt42 = false;
                            }
                        }
                    });
                    tue63.setVisibility(View.VISIBLE);
                    tue63.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt43 == false) {
                                u43.setVisibility(View.VISIBLE);
                                tt43 = true;
                            } else {
                                u43.setVisibility(View.GONE);
                                tt43 = false;
                            }
                        }
                    });
                    tue64.setVisibility(View.VISIBLE);
                    tue64.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt44 == false) {
                                u44.setVisibility(View.VISIBLE);
                                tt44 = true;
                            } else {
                                u44.setVisibility(View.GONE);
                                tt44 = false;
                            }
                        }
                    });

                    tue11111 = true;
                } else {
                    tue61.setVisibility(View.GONE);
                    tue62.setVisibility(View.GONE);
                    tue63.setVisibility(View.GONE);
                    tue64.setVisibility(View.GONE);
                    u41.setVisibility(View.GONE);
                    u42.setVisibility(View.GONE);
                    u43.setVisibility(View.GONE);
                    u44.setVisibility(View.GONE);
                    tue11111 = false;
                }
            }
        });
        //<------------------------------Tuesday #6--------------------------->
        this.tue7 = (Button) findViewById(R.id.tue7);
        this.tue71 = (Button) findViewById(R.id.tue71);
        this.tue73 = (Button) findViewById(R.id.tue73);
        this.tue74 = (Button) findViewById(R.id.tue74);
        this.u51 = (TextView) findViewById(R.id.tuet51);
        this.u53 = (TextView) findViewById(R.id.tuet53);
        this.u54 = (TextView) findViewById(R.id.tuet54);
        this.tue7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue0 == false) {
                    tue71.setVisibility(View.VISIBLE);
                    tue71.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt51 == false) {
                                u51.setVisibility(View.VISIBLE);
                                tt51 = true;
                            } else {
                                u51.setVisibility(View.GONE);
                                tt51 = false;
                            }
                        }
                    });
                    tue73.setVisibility(View.VISIBLE);
                    tue73.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt53 == false) {
                                u53.setVisibility(View.VISIBLE);
                                tt53 = true;
                            } else {
                                u53.setVisibility(View.GONE);
                                tt53 = false;
                            }
                        }
                    });
                    tue74.setVisibility(View.VISIBLE);
                    tue74.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt54 == false) {
                                u54.setVisibility(View.VISIBLE);
                                tt54 = true;
                            } else {
                                u54.setVisibility(View.GONE);
                                tt54 = false;
                            }
                        }
                    });
                    tue0 = true;
                } else {
                    tue71.setVisibility(View.GONE);
                    tue73.setVisibility(View.GONE);
                    tue74.setVisibility(View.GONE);
                    u51.setVisibility(View.GONE);
                    u53.setVisibility(View.GONE);
                    u54.setVisibility(View.GONE);
                    tue0 = false;
                }
            }
        });
        //<-------------------------Tuesday #6----------------------->
        this.tue8 = (Button) findViewById(R.id.tue8);
        this.tue81 = (Button) findViewById(R.id.tue81);
        this.tue82 = (Button) findViewById(R.id.tue82);
        this.tue83 = (Button) findViewById(R.id.tue83);
        this.tue84 = (Button) findViewById(R.id.tue84);
        this.tue85 = (Button) findViewById(R.id.tue85);
        this.tue86 = (Button) findViewById(R.id.tue86);
        this.u61 = (TextView) findViewById(R.id.tuet61);
        this.u62 = (TextView) findViewById(R.id.tuet62);
        this.u63 = (TextView) findViewById(R.id.tuet63);
        this.u64 = (TextView) findViewById(R.id.tuet64);
        this.u65 = (TextView) findViewById(R.id.tuet65);
        this.u66 = (TextView) findViewById(R.id.tuet66);
        this.tue8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue00 == false) {
                    tue81.setVisibility(View.VISIBLE);
                    tue81.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt61 == false) {
                                u61.setVisibility(View.VISIBLE);
                                tt61 = true;
                            } else {
                                u61.setVisibility(View.GONE);
                                tt61 = false;
                            }
                        }
                    });
                    tue82.setVisibility(View.VISIBLE);
                    tue82.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt62 == false) {
                                u62.setVisibility(View.VISIBLE);
                                tt62 = true;
                            } else {
                                u62.setVisibility(View.GONE);
                                tt62 = false;
                            }
                        }
                    });
                    tue83.setVisibility(View.VISIBLE);
                    tue83.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt63 == false) {
                                u63.setVisibility(View.VISIBLE);
                                tt63 = true;
                            } else {
                                u63.setVisibility(View.GONE);
                                tt63 = false;
                            }
                        }
                    });
                    tue84.setVisibility(View.VISIBLE);
                    tue84.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt64 == false) {
                                u64.setVisibility(View.VISIBLE);
                                tt64 = true;
                            } else {
                                u64.setVisibility(View.GONE);
                                tt64 = false;
                            }
                        }
                    });
                    tue85.setVisibility(View.VISIBLE);
                    tue85.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt65 == false) {
                                u65.setVisibility(View.VISIBLE);
                                tt65 = true;
                            } else {
                                u65.setVisibility(View.GONE);
                                tt65 = false;
                            }
                        }
                    });
                    tue86.setVisibility(View.VISIBLE);
                    tue86.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt66 == false) {
                                u66.setVisibility(View.VISIBLE);
                                tt66 = true;
                            } else {
                                u66.setVisibility(View.GONE);
                                tt66 = false;
                            }
                        }
                    });
                    tue00 = true;
                } else {
                    tue81.setVisibility(View.GONE);
                    tue82.setVisibility(View.GONE);
                    tue83.setVisibility(View.GONE);
                    tue84.setVisibility(View.GONE);
                    tue85.setVisibility(View.GONE);
                    tue86.setVisibility(View.GONE);
                    u61.setVisibility(View.GONE);
                    u62.setVisibility(View.GONE);
                    u63.setVisibility(View.GONE);
                    u64.setVisibility(View.GONE);
                    u65.setVisibility(View.GONE);
                    u66.setVisibility(View.GONE);
                    tue00 = false;
                }
            }
        });
        //<------------------------------Tuesday #7----------------------------->
        this.tue9 = (Button) findViewById(R.id.tue9);
        this.tue91 = (Button) findViewById(R.id.tue91);
        this.tue92 = (Button) findViewById(R.id.tue92);
        this.tue93 = (Button) findViewById(R.id.tue93);
        this.tue94 = (Button) findViewById(R.id.tue94);
        this.tue95 = (Button) findViewById(R.id.tue95);
        this.tue96 = (Button) findViewById(R.id.tue96);
        this.u71 = (TextView) findViewById(R.id.tuet71);
        this.u72 = (TextView) findViewById(R.id.tuet72);
        this.u73 = (TextView) findViewById(R.id.tuet73);
        this.u74 = (TextView) findViewById(R.id.tuet74);
        this.u75 = (TextView) findViewById(R.id.tuet75);
        this.u76 = (TextView) findViewById(R.id.tuet76);
        this.tue9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue000 == false) {
                    tue91.setVisibility(View.VISIBLE);
                    tue91.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt71 == false) {
                                u71.setVisibility(View.VISIBLE);
                                tt71 = true;
                            } else {
                                u71.setVisibility(View.GONE);
                                tt71 = false;
                            }
                        }
                    });
                    tue92.setVisibility(View.VISIBLE);
                    tue92.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt72 == false) {
                                u72.setVisibility(View.VISIBLE);
                                tt72 = true;
                            } else {
                                u72.setVisibility(View.GONE);
                                tt72 = false;
                            }
                        }
                    });
                    tue93.setVisibility(View.VISIBLE);
                    tue93.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt73 == false) {
                                u73.setVisibility(View.VISIBLE);
                                tt73 = true;
                            } else {
                                u73.setVisibility(View.GONE);
                                tt73 = false;
                            }
                        }
                    });
                    tue94.setVisibility(View.VISIBLE);
                    tue94.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt74 == false) {
                                u74.setVisibility(View.VISIBLE);
                                tt74 = true;
                            } else {
                                u74.setVisibility(View.GONE);
                                tt74 = false;
                            }
                        }
                    });
                    tue95.setVisibility(View.VISIBLE);
                    tue95.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt75 == false) {
                                u75.setVisibility(View.VISIBLE);
                                tt75 = true;
                            } else {
                                u75.setVisibility(View.GONE);
                                tt75 = false;
                            }
                        }
                    });
                    tue96.setVisibility(View.VISIBLE);
                    tue96.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt76 == false) {
                                u76.setVisibility(View.VISIBLE);
                                tt76 = true;
                            } else {
                                u76.setVisibility(View.GONE);
                                tt76 = false;
                            }
                        }
                    });
                    tue000 = true;
                } else {
                    tue91.setVisibility(View.GONE);
                    tue92.setVisibility(View.GONE);
                    tue93.setVisibility(View.GONE);
                    tue94.setVisibility(View.GONE);
                    tue95.setVisibility(View.GONE);
                    tue96.setVisibility(View.GONE);
                    u71.setVisibility(View.GONE);
                    u72.setVisibility(View.GONE);
                    u73.setVisibility(View.GONE);
                    u74.setVisibility(View.GONE);
                    u75.setVisibility(View.GONE);
                    u76.setVisibility(View.GONE);
                    tue000 = false;
                }
            }
        });
        //<----------------------------------------Tuesday #10---------------------------------------->
        this.tue10 = (Button) findViewById(R.id.tue10);
        this.tue101 = (Button) findViewById(R.id.tue101);
        this.tue102 = (Button) findViewById(R.id.tue102);
        this.tue103 = (Button) findViewById(R.id.tue103);
        this.tue104 = (Button) findViewById(R.id.tue104);
        this.tue105 = (Button) findViewById(R.id.tue105);
        this.tue108 = (Button) findViewById(R.id.tue108);
        this.u81 = (TextView) findViewById(R.id.tuet81);
        this.u82 = (TextView) findViewById(R.id.tuet82);
        this.u83 = (TextView) findViewById(R.id.tuet83);
        this.u84 = (TextView) findViewById(R.id.tuet84);
        this.u85 = (TextView) findViewById(R.id.tuet85);
        this.u88 = (TextView) findViewById(R.id.tuet88);
        this.tue10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue0000 == false) {
                    tue101.setVisibility(View.VISIBLE);
                    tue101.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt81 == false) {
                                u81.setVisibility(View.VISIBLE);
                                tt81 = true;
                            } else {
                                u81.setVisibility(View.GONE);
                                tt81 = false;
                            }
                        }
                    });
                    tue102.setVisibility(View.VISIBLE);
                    tue102.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt82 == false) {
                                u82.setVisibility(View.VISIBLE);
                                tt82 = true;
                            } else {
                                u82.setVisibility(View.GONE);
                                tt82 = false;
                            }
                        }
                    });
                    tue103.setVisibility(View.VISIBLE);
                    tue103.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt83 == false) {
                                u83.setVisibility(View.VISIBLE);
                                tt83 = true;
                            } else {
                                u83.setVisibility(View.GONE);
                                tt83 = false;
                            }
                        }
                    });
                    tue104.setVisibility(View.VISIBLE);
                    tue104.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt84 == false) {
                                u84.setVisibility(View.VISIBLE);
                                tt84 = true;
                            } else {
                                u84.setVisibility(View.GONE);
                                tt84 = false;
                            }
                        }
                    });
                    tue105.setVisibility(View.VISIBLE);
                    tue105.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt85 == false) {
                                u85.setVisibility(View.VISIBLE);
                                tt85 = true;
                            } else {
                                u85.setVisibility(View.GONE);
                                tt85 = false;
                            }
                        }
                    });

                    tue108.setVisibility(View.VISIBLE);
                    tue108.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt88 == false) {
                                u88.setVisibility(View.VISIBLE);
                                tt88 = true;
                            } else {
                                u88.setVisibility(View.GONE);
                                tt88 = false;
                            }
                        }
                    });
                    tue0000 = true;
                } else {
                    tue101.setVisibility(View.GONE);
                    tue102.setVisibility(View.GONE);
                    tue103.setVisibility(View.GONE);
                    tue104.setVisibility(View.GONE);
                    tue105.setVisibility(View.GONE);
                    tue108.setVisibility(View.GONE);
                    u81.setVisibility(View.GONE);
                    u82.setVisibility(View.GONE);
                    u83.setVisibility(View.GONE);
                    u84.setVisibility(View.GONE);
                    u85.setVisibility(View.GONE);
                    u88.setVisibility(View.GONE);
                    tue0000 = false;
                }
            }
        });
        //<--------------------------------Tuesday #11--------------------------------------->
        this.tue = (Button) findViewById(R.id.tue11);
        this.tue121 = (Button) findViewById(R.id.tue121);
        this.tue112 = (Button) findViewById(R.id.tue112);
        this.tue113 = (Button) findViewById(R.id.tue113);
        this.tue114 = (Button) findViewById(R.id.tue114);
        this.tue115 = (Button) findViewById(R.id.tue115);
        this.u91 = (TextView) findViewById(R.id.tuet91);
        this.u92 = (TextView) findViewById(R.id.tuet92);
        this.u93 = (TextView) findViewById(R.id.tuet93);
        this.u94 = (TextView) findViewById(R.id.tuet94);
        this.u95 = (TextView) findViewById(R.id.tuet95);
        this.tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue00000 == false) {
                    tue121.setVisibility(View.VISIBLE);
                    tue121.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt91 == false) {
                                u91.setVisibility(View.VISIBLE);
                                tt91 = true;
                            } else {
                                u91.setVisibility(View.GONE);
                                tt91 = false;
                            }
                        }
                    });
                    tue112.setVisibility(View.VISIBLE);
                    tue112.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt92 == false) {
                                u92.setVisibility(View.VISIBLE);
                                tt92 = true;
                            } else {
                                u92.setVisibility(View.GONE);
                                tt92 = false;
                            }
                        }
                    });
                    tue113.setVisibility(View.VISIBLE);
                    tue113.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt93 == false) {
                                u93.setVisibility(View.VISIBLE);
                                tt93 = true;
                            } else {
                                u93.setVisibility(View.GONE);
                                tt93 = false;
                            }
                        }
                    });
                    tue114.setVisibility(View.VISIBLE);
                    tue114.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt94 == false) {
                                u94.setVisibility(View.VISIBLE);
                                tt94 = true;
                            } else {
                                u94.setVisibility(View.GONE);
                                tt94 = false;
                            }
                        }
                    });
                    tue115.setVisibility(View.VISIBLE);
                    tue115.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt95 == false) {
                                u95.setVisibility(View.VISIBLE);
                                tt95 = true;
                            } else {
                                u95.setVisibility(View.GONE);
                                tt95 = false;
                            }
                        }
                    });
                    tue00000 = true;
                } else {
                    tue121.setVisibility(View.GONE);
                    tue112.setVisibility(View.GONE);
                    tue113.setVisibility(View.GONE);
                    tue114.setVisibility(View.GONE);
                    tue115.setVisibility(View.GONE);
                    u91.setVisibility(View.GONE);
                    u92.setVisibility(View.GONE);
                    u93.setVisibility(View.GONE);
                    u94.setVisibility(View.GONE);
                    u95.setVisibility(View.GONE);
                    tue00000 = false;
                }
            }
        });
        //<--------------------------------Tuesday #12------------------------------------->
        this.tuee = (Button) findViewById(R.id.tue12);
        this.tue131 = (Button) findViewById(R.id.tue131);
        this.tue122 = (Button) findViewById(R.id.tue122);
        this.tue123 = (Button) findViewById(R.id.tue123);
        this.tue124 = (Button) findViewById(R.id.tue124);
        this.tue125 = (Button) findViewById(R.id.tue125);
        this.tue126 = (Button) findViewById(R.id.tue126);
        this.u101 = (TextView) findViewById(R.id.tuet101);
        this.u102 = (TextView) findViewById(R.id.tuet102);
        this.u103 = (TextView) findViewById(R.id.tuet103);
        this.u104 = (TextView) findViewById(R.id.tuet104);
        this.u105 = (TextView) findViewById(R.id.tuet105);
        this.u106 = (TextView) findViewById(R.id.tuet106);
        this.tuee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue22222 == false) {
                    tue131.setVisibility(View.VISIBLE);
                    tue131.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt101 == false) {
                                u101.setVisibility(View.VISIBLE);
                                tt101 = true;
                            } else {
                                u101.setVisibility(View.GONE);
                                tt101 = false;
                            }
                        }
                    });
                    tue122.setVisibility(View.VISIBLE);
                    tue122.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt102 == false) {
                                u102.setVisibility(View.VISIBLE);
                                tt102 = true;
                            } else {
                                u102.setVisibility(View.GONE);
                                tt102 = false;
                            }
                        }
                    });
                    tue123.setVisibility(View.VISIBLE);
                    tue123.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt103 == false) {
                                u103.setVisibility(View.VISIBLE);
                                tt103 = true;
                            } else {
                                u103.setVisibility(View.GONE);
                                tt103 = false;
                            }
                        }
                    });
                    tue124.setVisibility(View.VISIBLE);
                    tue124.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt104 == false) {
                                u104.setVisibility(View.VISIBLE);
                                tt104 = true;
                            } else {
                                u104.setVisibility(View.GONE);
                                tt104 = false;
                            }
                        }
                    });
                    tue125.setVisibility(View.VISIBLE);
                    tue125.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt105 == false) {
                                u105.setVisibility(View.VISIBLE);
                                tt105 = true;
                            } else {
                                u105.setVisibility(View.GONE);
                                tt105 = false;
                            }
                        }
                    });
                    tue126.setVisibility(View.VISIBLE);
                    tue126.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt106 == false) {
                                u106.setVisibility(View.VISIBLE);
                                tt106 = true;
                            } else {
                                u106.setVisibility(View.GONE);
                                tt106 = false;
                            }
                        }
                    });
                    tue22222 = true;
                } else {
                    tue131.setVisibility(View.GONE);
                    tue122.setVisibility(View.GONE);
                    tue123.setVisibility(View.GONE);
                    tue124.setVisibility(View.GONE);
                    tue125.setVisibility(View.GONE);
                    tue126.setVisibility(View.GONE);
                    u101.setVisibility(View.GONE);
                    u102.setVisibility(View.GONE);
                    u103.setVisibility(View.GONE);
                    u104.setVisibility(View.GONE);
                    u105.setVisibility(View.GONE);
                    u106.setVisibility(View.GONE);
                    tue22222 = false;
                }
            }
        });
        //<-------------------------------------TUESDAY #13------------------------------------->
        this.tueee = (Button) findViewById(R.id.tue13);
        this.tue141 = (Button) findViewById(R.id.tue141);
        this.tue132 = (Button) findViewById(R.id.tue132);
        this.tue133 = (Button) findViewById(R.id.tue133);
        this.tue134 = (Button) findViewById(R.id.tue134);
        this.tue135 = (Button) findViewById(R.id.tue135);
        this.tue136 = (Button) findViewById(R.id.tue136);
        this.u111 = (TextView) findViewById(R.id.tuet111);
        this.u112 = (TextView) findViewById(R.id.tuet112);
        this.u113 = (TextView) findViewById(R.id.tuet113);
        this.u114 = (TextView) findViewById(R.id.tuet114);
        this.u115 = (TextView) findViewById(R.id.tuet115);
        this.u116 = (TextView) findViewById(R.id.tuet116);
        this.tueee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue000000 == false) {
                    tue141.setVisibility(View.VISIBLE);
                    tue141.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt111 == false) {
                                u111.setVisibility(View.VISIBLE);
                                tt111 = true;
                            } else {
                                u111.setVisibility(View.GONE);
                                tt111 = false;
                            }
                        }
                    });
                    tue132.setVisibility(View.VISIBLE);
                    tue132.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt112 == false) {
                                u112.setVisibility(View.VISIBLE);
                                tt112 = true;
                            } else {
                                u112.setVisibility(View.GONE);
                                tt112 = false;
                            }
                        }
                    });
                    tue133.setVisibility(View.VISIBLE);
                    tue133.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt113 == false) {
                                u113.setVisibility(View.VISIBLE);
                                tt113 = true;
                            } else {
                                u113.setVisibility(View.GONE);
                                tt113 = false;
                            }
                        }
                    });
                    tue134.setVisibility(View.VISIBLE);
                    tue134.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt114 == false) {
                                u114.setVisibility(View.VISIBLE);
                                tt114 = true;
                            } else {
                                u114.setVisibility(View.GONE);
                                tt114 = false;
                            }
                        }
                    });
                    tue135.setVisibility(View.VISIBLE);
                    tue135.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt115 == false) {
                                u115.setVisibility(View.VISIBLE);
                                tt115 = true;
                            } else {
                                u115.setVisibility(View.GONE);
                                tt115 = false;
                            }
                        }
                    });
                    tue136.setVisibility(View.VISIBLE);
                    tue136.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt116 == false) {
                                u116.setVisibility(View.VISIBLE);
                                tt116 = true;
                            } else {
                                u116.setVisibility(View.GONE);
                                tt116 = false;
                            }
                        }
                    });
                    tue000000 = true;
                } else {
                    tue141.setVisibility(View.GONE);
                    tue132.setVisibility(View.GONE);
                    tue133.setVisibility(View.GONE);
                    tue134.setVisibility(View.GONE);
                    tue135.setVisibility(View.GONE);
                    tue136.setVisibility(View.GONE);
                    u111.setVisibility(View.GONE);
                    u112.setVisibility(View.GONE);
                    u113.setVisibility(View.GONE);
                    u114.setVisibility(View.GONE);
                    u115.setVisibility(View.GONE);
                    u116.setVisibility(View.GONE);
                    tue000000 = false;
                }
            }
        });
        //<------------------------------TUESDAY #14--------------------------------->
        this.tueeee = (Button) findViewById(R.id.tue14);
        this.tue151 = (Button) findViewById(R.id.tue151);
        this.tue142 = (Button) findViewById(R.id.tue142);
        this.tue143 = (Button) findViewById(R.id.tue143);
        this.tue144 = (Button) findViewById(R.id.tue144);
        this.tue145 = (Button) findViewById(R.id.tue145);
        this.tue146 = (Button) findViewById(R.id.tue146);
        this.u121 = (TextView) findViewById(R.id.tuet121);
        this.u122 = (TextView) findViewById(R.id.tuet122);
        this.u123 = (TextView) findViewById(R.id.tuet123);
        this.u124 = (TextView) findViewById(R.id.tuet124);
        this.u125 = (TextView) findViewById(R.id.tuet125);
        this.u126 = (TextView) findViewById(R.id.tuet126);
        this.tueeee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tue111111 == false) {
                    tue151.setVisibility(View.VISIBLE);
                    tue151.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt121 == false) {
                                u121.setVisibility(View.VISIBLE);
                                tt121 = true;
                            } else {
                                u121.setVisibility(View.GONE);
                                tt121 = false;
                            }
                        }
                    });
                    tue142.setVisibility(View.VISIBLE);
                    tue142.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt122 == false) {
                                u122.setVisibility(View.VISIBLE);
                                tt122 = true;
                            } else {
                                u122.setVisibility(View.GONE);
                                tt122 = false;
                            }
                        }
                    });
                    tue143.setVisibility(View.VISIBLE);
                    tue143.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt123 == false) {
                                u123.setVisibility(View.VISIBLE);
                                tt123 = true;
                            } else {
                                u123.setVisibility(View.GONE);
                                tt123 = false;
                            }
                        }
                    });
                    tue144.setVisibility(View.VISIBLE);
                    tue144.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt124 == false) {
                                u124.setVisibility(View.VISIBLE);
                                tt124 = true;
                            } else {
                                u124.setVisibility(View.GONE);
                                tt124 = false;
                            }
                        }
                    });
                    tue145.setVisibility(View.VISIBLE);
                    tue145.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt125 == false) {
                                u125.setVisibility(View.VISIBLE);
                                tt125 = true;
                            } else {
                                u125.setVisibility(View.GONE);
                                tt125 = false;
                            }
                        }
                    });
                    tue146.setVisibility(View.VISIBLE);
                    tue146.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tt126 == false) {
                                u126.setVisibility(View.VISIBLE);
                                tt126 = true;
                            } else {
                                u126.setVisibility(View.GONE);
                                tt126 = false;
                            }
                        }
                    });
                    tue111111 = true;
                } else {
                    tue151.setVisibility(View.GONE);
                    tue142.setVisibility(View.GONE);
                    tue143.setVisibility(View.GONE);
                    tue144.setVisibility(View.GONE);
                    tue145.setVisibility(View.GONE);
                    tue146.setVisibility(View.GONE);
                    u121.setVisibility(View.GONE);
                    u122.setVisibility(View.GONE);
                    u123.setVisibility(View.GONE);
                    u124.setVisibility(View.GONE);
                    u125.setVisibility(View.GONE);
                    u126.setVisibility(View.GONE);
                    tue111111 = false;
                }
            }
        });
        //<--------------------------------------------------WEDNESDAY #1------------------------------------------------------------->
        this.wed2 = (Button) findViewById(R.id.wed2);
        this.wed21 = (Button) findViewById(R.id.wed21);
        this.wed22 = (Button) findViewById(R.id.wed22);
        this.wed24 = (Button) findViewById(R.id.wed24);
        this.wed25 = (Button) findViewById(R.id.wed25);
        this.wed26 = (Button) findViewById(R.id.wed26);
        this.v1 = (TextView) findViewById(R.id.wedt1);
        this.v2 = (TextView) findViewById(R.id.wedt2);
        this.v4 = (TextView) findViewById(R.id.wedt4);
        this.v5 = (TextView) findViewById(R.id.wedt5);
        this.v6 = (TextView) findViewById(R.id.wedt6);
        this.wed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w1 == false) {
                    wed21.setVisibility(View.VISIBLE);
                    wed21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt1 == false) {
                                v1.setVisibility(View.VISIBLE);
                                wt1 = true;
                            } else {
                                v1.setVisibility(View.GONE);
                                wt1 = false;
                            }
                        }
                    });
                    wed22.setVisibility(View.VISIBLE);
                    wed22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt2 == false) {
                                v2.setVisibility(View.VISIBLE);
                                wt2 = true;
                            } else {
                                v2.setVisibility(View.GONE);
                                wt2 = false;
                            }
                        }
                    });
                    wed23.setVisibility(View.VISIBLE);
                    wed23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt3 == false) {
                                v3.setVisibility(View.VISIBLE);
                                wt3 = true;
                            } else {
                                v3.setVisibility(View.GONE);
                                wt3 = false;
                            }
                        }
                    });
                    wed24.setVisibility(View.VISIBLE);
                    wed24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt4 == false) {
                                v4.setVisibility(View.VISIBLE);
                                wt4 = true;
                            } else {
                                v4.setVisibility(View.GONE);
                                wt4 = false;
                            }
                        }
                    });
                    wed25.setVisibility(View.VISIBLE);
                    wed25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt5 == false) {
                                v5.setVisibility(View.VISIBLE);
                                wt5 = true;
                            } else {
                                v5.setVisibility(View.GONE);
                                wt5 = false;
                            }
                        }
                    });
                    wed26.setVisibility(View.VISIBLE);
                    wed26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt6 == false) {
                                v6.setVisibility(View.VISIBLE);
                                wt6 = true;
                            } else {
                                v6.setVisibility(View.GONE);
                                wt6 = false;
                            }
                        }
                    });
                    w1 = true;
                } else {
                    wed21.setVisibility(View.GONE);
                    wed22.setVisibility(View.GONE);
                    wed23.setVisibility(View.GONE);
                    wed24.setVisibility(View.GONE);
                    wed25.setVisibility(View.GONE);
                    wed26.setVisibility(View.GONE);
                    v1.setVisibility(View.GONE);
                    v2.setVisibility(View.GONE);
                    v3.setVisibility(View.GONE);
                    v4.setVisibility(View.GONE);
                    v5.setVisibility(View.GONE);
                    v6.setVisibility(View.GONE);
                    w1 = false;
                }
            }
        });
        //<------------------------------WEDNESDAY #2----------------------------------------------->
        this.wed3 = (Button) findViewById(R.id.wed3);
        this.wed31 = (Button) findViewById(R.id.wed31);
        this.wed32 = (Button) findViewById(R.id.wed32);
        this.wed33 = (Button) findViewById(R.id.wed33);
        this.wed34 = (Button) findViewById(R.id.wed34);
        this.wed35 = (Button) findViewById(R.id.wed35);
        this.wed36 = (Button) findViewById(R.id.wed36);
        this.v11 = (TextView) findViewById(R.id.wedt11);
        this.v12 = (TextView) findViewById(R.id.wedt12);
        this.v13 = (TextView) findViewById(R.id.wedt13);
        this.v14 = (TextView) findViewById(R.id.wedt14);
        this.v15 = (TextView) findViewById(R.id.wedt15);
        this.v16 = (TextView) findViewById(R.id.wedt16);
        this.wed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w2 == false) {
                    wed31.setVisibility(View.VISIBLE);
                    wed31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt11 == false) {
                                v11.setVisibility(View.VISIBLE);
                                wt11 = true;
                            } else {
                                v11.setVisibility(View.GONE);
                                wt11 = false;
                            }
                        }
                    });
                    wed32.setVisibility(View.VISIBLE);
                    wed32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt12 == false) {
                                v12.setVisibility(View.VISIBLE);
                                wt12 = true;
                            } else {
                                v12.setVisibility(View.GONE);
                                wt12 = false;
                            }
                        }
                    });
                    wed33.setVisibility(View.VISIBLE);
                    wed33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt13 == false) {
                                v13.setVisibility(View.VISIBLE);
                                wt13 = true;
                            } else {
                                v13.setVisibility(View.GONE);
                                wt13 = false;
                            }
                        }
                    });
                    wed34.setVisibility(View.VISIBLE);
                    wed34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt14 == false) {
                                v14.setVisibility(View.VISIBLE);
                                wt14 = true;
                            } else {
                                v14.setVisibility(View.GONE);
                                wt14 = false;
                            }
                        }
                    });
                    wed35.setVisibility(View.VISIBLE);
                    wed35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt15 == false) {
                                v15.setVisibility(View.VISIBLE);
                                wt15 = true;
                            } else {
                                v15.setVisibility(View.GONE);
                                wt15 = false;
                            }
                        }
                    });
                    wed36.setVisibility(View.VISIBLE);
                    wed36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt16 == false) {
                                v16.setVisibility(View.VISIBLE);
                                wt16 = true;
                            } else {
                                v16.setVisibility(View.GONE);
                                wt16 = false;
                            }
                        }
                    });
                    w2 = true;
                } else {
                    wed31.setVisibility(View.GONE);
                    wed32.setVisibility(View.GONE);
                    wed33.setVisibility(View.GONE);
                    wed34.setVisibility(View.GONE);
                    wed35.setVisibility(View.GONE);
                    wed36.setVisibility(View.GONE);
                    v11.setVisibility(View.GONE);
                    v12.setVisibility(View.GONE);
                    v13.setVisibility(View.GONE);
                    v14.setVisibility(View.GONE);
                    v15.setVisibility(View.GONE);
                    v16.setVisibility(View.GONE);
                    w2 = false;
                }
            }
        });
        //<-----------------------------------------WEDNESDAY #3---------------------->
        this.wed4 = (Button) findViewById(R.id.wed4);
        this.wed41 = (Button) findViewById(R.id.wed41);
        this.wed42 = (Button) findViewById(R.id.wed42);
        this.wed43 = (Button) findViewById(R.id.wed43);
        this.wed44 = (Button) findViewById(R.id.wed44);
        this.wed45 = (Button) findViewById(R.id.wed45);
        this.wed46 = (Button) findViewById(R.id.wed46);
        this.v21 = (TextView) findViewById(R.id.wedt21);
        this.v22 = (TextView) findViewById(R.id.wedt22);
        this.v23 = (TextView) findViewById(R.id.wedt23);
        this.v24 = (TextView) findViewById(R.id.wedt24);
        this.v25 = (TextView) findViewById(R.id.wedt25);
        this.v26 = (TextView) findViewById(R.id.wedt26);
        this.wed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w3 == false) {
                    wed41.setVisibility(View.VISIBLE);
                    wed41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt21 == false) {
                                v21.setVisibility(View.VISIBLE);
                                wt21 = true;
                            } else {
                                v21.setVisibility(View.GONE);
                                wt21 = false;
                            }
                        }
                    });
                    wed42.setVisibility(View.VISIBLE);
                    wed42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt22 == false) {
                                v22.setVisibility(View.VISIBLE);
                                wt22 = true;
                            } else {
                                v22.setVisibility(View.GONE);
                                wt22 = false;
                            }
                        }
                    });
                    wed43.setVisibility(View.VISIBLE);
                    wed43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt23 == false) {
                                v23.setVisibility(View.VISIBLE);
                                wt23 = true;
                            } else {
                                v23.setVisibility(View.GONE);
                                wt23 = false;
                            }
                        }
                    });
                    wed44.setVisibility(View.VISIBLE);
                    wed44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt24 == false) {
                                v24.setVisibility(View.VISIBLE);
                                wt24 = true;
                            } else {
                                v24.setVisibility(View.GONE);
                                wt24 = false;
                            }
                        }
                    });
                    wed45.setVisibility(View.VISIBLE);
                    wed45.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt25 == false) {
                                v25.setVisibility(View.VISIBLE);
                                wt25 = true;
                            } else {
                                v25.setVisibility(View.GONE);
                                wt25 = false;
                            }
                        }
                    });
                    wed46.setVisibility(View.VISIBLE);
                    wed46.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt26 == false) {
                                v26.setVisibility(View.VISIBLE);
                                wt26 = true;
                            } else {
                                v26.setVisibility(View.GONE);
                                wt26 = false;
                            }
                        }
                    });
                    w3 = true;
                } else {
                    wed41.setVisibility(View.GONE);
                    wed42.setVisibility(View.GONE);
                    wed43.setVisibility(View.GONE);
                    wed44.setVisibility(View.GONE);
                    wed45.setVisibility(View.GONE);
                    wed46.setVisibility(View.GONE);
                    v21.setVisibility(View.GONE);
                    v22.setVisibility(View.GONE);
                    v23.setVisibility(View.GONE);
                    v24.setVisibility(View.GONE);
                    v25.setVisibility(View.GONE);
                    v26.setVisibility(View.GONE);
                    w3 = false;
                }
            }
        });
        //<---------------------------------------WEDNESDAY #4-------------------------------------------->
        this.wed5 = (Button) findViewById(R.id.wed5);
        this.wed51 = (Button) findViewById(R.id.wed51);
        this.wed52 = (Button) findViewById(R.id.wed52);
        this.wed53 = (Button) findViewById(R.id.wed53);
        this.wed54 = (Button) findViewById(R.id.wed54);
        this.wed55 = (Button) findViewById(R.id.wed55);
        this.wed56 = (Button) findViewById(R.id.wed56);
        this.v31 = (TextView) findViewById(R.id.wedt31);
        this.v32 = (TextView) findViewById(R.id.wedt32);
        this.v33 = (TextView) findViewById(R.id.wedt33);
        this.v34 = (TextView) findViewById(R.id.wedt34);
        this.v35 = (TextView) findViewById(R.id.wedt35);
        this.v36 = (TextView) findViewById(R.id.wedt36);
        this.wed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w4 == false) {
                    wed51.setVisibility(View.VISIBLE);
                    wed51.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt31 == false) {
                                v31.setVisibility(View.VISIBLE);
                                wt31 = true;
                            } else {
                                v31.setVisibility(View.GONE);
                                wt31 = false;
                            }
                        }
                    });
                    wed52.setVisibility(View.VISIBLE);
                    wed52.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt32 == false) {
                                v32.setVisibility(View.VISIBLE);
                                wt32 = true;
                            } else {
                                v32.setVisibility(View.GONE);
                                wt32 = false;
                            }
                        }
                    });
                    wed53.setVisibility(View.VISIBLE);
                    wed53.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt33 == false) {
                                v33.setVisibility(View.VISIBLE);
                                wt33 = true;
                            } else {
                                v33.setVisibility(View.GONE);
                                wt33 = false;
                            }
                        }
                    });
                    wed54.setVisibility(View.VISIBLE);
                    wed54.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt34 == false) {
                                v34.setVisibility(View.VISIBLE);
                                wt34 = true;
                            } else {
                                v34.setVisibility(View.GONE);
                                wt34 = false;
                            }
                        }
                    });
                    wed55.setVisibility(View.VISIBLE);
                    wed55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt35 == false) {
                                v35.setVisibility(View.VISIBLE);
                                wt35 = true;
                            } else {
                                v35.setVisibility(View.GONE);
                                wt35 = false;
                            }
                        }
                    });
                    wed56.setVisibility(View.VISIBLE);
                    wed56.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt36 == false) {
                                v36.setVisibility(View.VISIBLE);
                                wt36 = true;
                            } else {
                                v36.setVisibility(View.GONE);
                                wt36 = false;
                            }
                        }
                    });
                    w4 = true;
                } else {
                    wed51.setVisibility(View.GONE);
                    wed52.setVisibility(View.GONE);
                    wed53.setVisibility(View.GONE);
                    wed54.setVisibility(View.GONE);
                    wed55.setVisibility(View.GONE);
                    wed56.setVisibility(View.GONE);
                    v31.setVisibility(View.GONE);
                    v32.setVisibility(View.GONE);
                    v33.setVisibility(View.GONE);
                    v34.setVisibility(View.GONE);
                    v35.setVisibility(View.GONE);
                    v36.setVisibility(View.GONE);
                    w4 = false;
                }
            }
        });
        //<-----------------------------------------------WEDNESDAY #5------------------------------------>
        this.wed6 = (Button) findViewById(R.id.wed6);
        this.wed61 = (Button) findViewById(R.id.wed61);
        this.wed62 = (Button) findViewById(R.id.wed62);
        this.wed63 = (Button) findViewById(R.id.wed63);
        this.wed64 = (Button) findViewById(R.id.wed64);
        this.wed65 = (Button) findViewById(R.id.wed65);
        this.wed66 = (Button) findViewById(R.id.wed66);
        this.v41 = (TextView) findViewById(R.id.wedt41);
        this.v42 = (TextView) findViewById(R.id.wedt42);
        this.v43 = (TextView) findViewById(R.id.wedt43);
        this.v44 = (TextView) findViewById(R.id.wedt44);
        this.v45 = (TextView) findViewById(R.id.wedt45);
        this.v46 = (TextView) findViewById(R.id.wedt46);
        this.wed6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w5 == false) {
                    wed61.setVisibility(View.VISIBLE);
                    wed61.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt41 == false) {
                                v41.setVisibility(View.VISIBLE);
                                wt41 = true;
                            } else {
                                v41.setVisibility(View.GONE);
                                wt41 = false;
                            }
                        }
                    });
                    wed62.setVisibility(View.VISIBLE);
                    wed62.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt42 == false) {
                                v42.setVisibility(View.VISIBLE);
                                wt42 = true;
                            } else {
                                v42.setVisibility(View.GONE);
                                wt42 = false;
                            }
                        }
                    });
                    wed63.setVisibility(View.VISIBLE);
                    wed63.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt43 == false) {
                                v43.setVisibility(View.VISIBLE);
                                wt43 = true;
                            } else {
                                v43.setVisibility(View.GONE);
                                wt43 = false;
                            }
                        }
                    });
                    wed64.setVisibility(View.VISIBLE);
                    wed64.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt44 == false) {
                                v44.setVisibility(View.VISIBLE);
                                wt44 = true;
                            } else {
                                v44.setVisibility(View.GONE);
                                wt44 = false;
                            }
                        }
                    });
                    wed65.setVisibility(View.VISIBLE);
                    wed65.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt45 == false) {
                                v45.setVisibility(View.VISIBLE);
                                wt45 = true;
                            } else {
                                v45.setVisibility(View.GONE);
                                wt45 = false;
                            }
                        }
                    });
                    wed66.setVisibility(View.VISIBLE);
                    wed66.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt46 == false) {
                                v46.setVisibility(View.VISIBLE);
                                wt46 = true;
                            } else {
                                v46.setVisibility(View.GONE);
                                wt46 = false;
                            }
                        }
                    });
                    w5 = true;
                } else {
                    wed61.setVisibility(View.GONE);
                    wed62.setVisibility(View.GONE);
                    wed63.setVisibility(View.GONE);
                    wed64.setVisibility(View.GONE);
                    wed65.setVisibility(View.GONE);
                    wed66.setVisibility(View.GONE);
                    v41.setVisibility(View.GONE);
                    v42.setVisibility(View.GONE);
                    v43.setVisibility(View.GONE);
                    v44.setVisibility(View.GONE);
                    v45.setVisibility(View.GONE);
                    v46.setVisibility(View.GONE);
                    w5 = false;
                }
            }
        });
        //<-------------------------------WEDNESDAY #6----------------------------------->
        this.wed7 = (Button) findViewById(R.id.wed7);
        this.wed71 = (Button) findViewById(R.id.wed71);
        this.wed72 = (Button) findViewById(R.id.wed72);
        this.wed73 = (Button) findViewById(R.id.wed73);
        this.wed74 = (Button) findViewById(R.id.wed74);
        this.wed75 = (Button) findViewById(R.id.wed75);
        this.wed76 = (Button) findViewById(R.id.wed76);
        this.v51 = (TextView) findViewById(R.id.wedt51);
        this.v52 = (TextView) findViewById(R.id.wedt52);
        this.v53 = (TextView) findViewById(R.id.wedt53);
        this.v54 = (TextView) findViewById(R.id.wedt54);
        this.v55 = (TextView) findViewById(R.id.wedt55);
        this.v56 = (TextView) findViewById(R.id.wedt56);
        this.wed7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w6 == false) {
                    wed71.setVisibility(View.VISIBLE);
                    wed71.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt51 == false) {
                                v51.setVisibility(View.VISIBLE);
                                wt51 = true;
                            } else {
                                v51.setVisibility(View.GONE);
                                wt51 = false;
                            }
                        }
                    });
                    wed72.setVisibility(View.VISIBLE);
                    wed72.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt52 == false) {
                                v52.setVisibility(View.VISIBLE);
                                wt52 = true;
                            } else {
                                v52.setVisibility(View.GONE);
                                wt52 = false;
                            }
                        }
                    });
                    wed73.setVisibility(View.VISIBLE);
                    wed73.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt53 == false) {
                                v53.setVisibility(View.VISIBLE);
                                wt53 = true;
                            } else {
                                v53.setVisibility(View.GONE);
                                wt53 = false;
                            }
                        }
                    });
                    wed74.setVisibility(View.VISIBLE);
                    wed74.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt54 == false) {
                                v54.setVisibility(View.VISIBLE);
                                wt54 = true;
                            } else {
                                v54.setVisibility(View.GONE);
                                wt54 = false;
                            }
                        }
                    });
                    wed75.setVisibility(View.VISIBLE);
                    wed75.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt55 == false) {
                                v55.setVisibility(View.VISIBLE);
                                wt55 = true;
                            } else {
                                v55.setVisibility(View.GONE);
                                wt55 = false;
                            }
                        }
                    });
                    wed76.setVisibility(View.VISIBLE);
                    wed76.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt56 == false) {
                                v56.setVisibility(View.VISIBLE);
                                wt56 = true;
                            } else {
                                v56.setVisibility(View.GONE);
                                wt56 = false;
                            }
                        }
                    });
                    w6 = true;
                } else {
                    wed71.setVisibility(View.GONE);
                    wed72.setVisibility(View.GONE);
                    wed73.setVisibility(View.GONE);
                    wed74.setVisibility(View.GONE);
                    wed75.setVisibility(View.GONE);
                    wed76.setVisibility(View.GONE);
                    v51.setVisibility(View.GONE);
                    v52.setVisibility(View.GONE);
                    v53.setVisibility(View.GONE);
                    v54.setVisibility(View.GONE);
                    v55.setVisibility(View.GONE);
                    v56.setVisibility(View.GONE);
                    w6 = false;
                }
            }
        });
        //<----------------------------------------WEDNESDAY #7------------------------------------------>
        this.wed8 = (Button) findViewById(R.id.wed8);
        this.wed81 = (Button) findViewById(R.id.wed81);
        this.wed82 = (Button) findViewById(R.id.wed82);
        this.wed83 = (Button) findViewById(R.id.wed83);
        this.wed84 = (Button) findViewById(R.id.wed84);
        this.wed85 = (Button) findViewById(R.id.wed85);
        this.wed86 = (Button) findViewById(R.id.wed86);
        this.v61 = (TextView) findViewById(R.id.wedt61);
        this.v62 = (TextView) findViewById(R.id.wedt62);
        this.v63 = (TextView) findViewById(R.id.wedt63);
        this.v64 = (TextView) findViewById(R.id.wedt64);
        this.v65 = (TextView) findViewById(R.id.wedt65);
        this.v66 = (TextView) findViewById(R.id.wedt66);
        this.wed8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w6 == false) {
                    wed81.setVisibility(View.VISIBLE);
                    wed81.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt61 == false) {
                                v61.setVisibility(View.VISIBLE);
                                wt61 = true;
                            } else {
                                v61.setVisibility(View.GONE);
                                wt61 = false;
                            }
                        }
                    });
                    wed82.setVisibility(View.VISIBLE);
                    wed82.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt62 == false) {
                                v62.setVisibility(View.VISIBLE);
                                wt62 = true;
                            } else {
                                v62.setVisibility(View.GONE);
                                wt62 = false;
                            }
                        }
                    });
                    wed83.setVisibility(View.VISIBLE);
                    wed83.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt63 == false) {
                                v63.setVisibility(View.VISIBLE);
                                wt63 = true;
                            } else {
                                v63.setVisibility(View.GONE);
                                wt63 = false;
                            }
                        }
                    });
                    wed84.setVisibility(View.VISIBLE);
                    wed84.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt64 == false) {
                                v64.setVisibility(View.VISIBLE);
                                wt64 = true;
                            } else {
                                v64.setVisibility(View.GONE);
                                wt64 = false;
                            }
                        }
                    });
                    wed85.setVisibility(View.VISIBLE);
                    wed85.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt65 == false) {
                                v65.setVisibility(View.VISIBLE);
                                wt65 = true;
                            } else {
                                v65.setVisibility(View.GONE);
                                wt65 = false;
                            }
                        }
                    });
                    wed86.setVisibility(View.VISIBLE);
                    wed86.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (wt66 == false) {
                                v66.setVisibility(View.VISIBLE);
                                wt66 = true;
                            } else {
                                v66.setVisibility(View.GONE);
                                wt66 = false;
                            }
                        }
                    });
                    w6 = true;
                } else {
                    wed81.setVisibility(View.GONE);
                    wed82.setVisibility(View.GONE);
                    wed83.setVisibility(View.GONE);
                    wed84.setVisibility(View.GONE);
                    wed85.setVisibility(View.GONE);
                    wed86.setVisibility(View.GONE);
                    v61.setVisibility(View.GONE);
                    v62.setVisibility(View.GONE);
                    v63.setVisibility(View.GONE);
                    v64.setVisibility(View.GONE);
                    v65.setVisibility(View.GONE);
                    v66.setVisibility(View.GONE);
                    w6 = false;
                }
            }
        });
        //<---------------------------------------------------Thursday #1---------------------------------------------->
        this.thur2 = (Button) findViewById(R.id.thur2);
        this.thur21 = (Button) findViewById(R.id.thu21);
        this.thur22 = (Button) findViewById(R.id.thu22);
        this.thur23 = (Button) findViewById(R.id.thu23);
        this.thur24 = (Button) findViewById(R.id.thu24);
        this.thur25 = (Button) findViewById(R.id.thu25);
        this.thur26 = (Button) findViewById(R.id.thu26);
        this.y1 = (TextView) findViewById(R.id.thut1);
        this.y2 = (TextView) findViewById(R.id.thut2);
        this.y3 = (TextView) findViewById(R.id.thut3);
        this.y4 = (TextView) findViewById(R.id.thut4);
        this.y5 = (TextView) findViewById(R.id.thut5);
        this.y6 = (TextView) findViewById(R.id.thut6);
        this.thur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th1 == false) {
                    thur21.setVisibility(View.VISIBLE);
                    thur21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht1 == false) {
                                y1.setVisibility(View.VISIBLE);
                                tht1 = true;
                            } else {
                                y1.setVisibility(View.GONE);
                                tht1 = false;
                            }
                        }
                    });
                    thur22.setVisibility(View.VISIBLE);
                    thur22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht2 == false) {
                                y2.setVisibility(View.VISIBLE);
                                tht2 = true;
                            } else {
                                y2.setVisibility(View.GONE);
                                tht2 = false;
                            }
                        }
                    });
                    thur23.setVisibility(View.VISIBLE);
                    thur23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht3 == false) {
                                y3.setVisibility(View.VISIBLE);
                                tht3 = true;
                            } else {
                                y3.setVisibility(View.GONE);
                                tht3 = false;
                            }
                        }
                    });
                    thur24.setVisibility(View.VISIBLE);
                    thur24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht4 == false) {
                                y4.setVisibility(View.VISIBLE);
                                tht4 = true;
                            } else {
                                y4.setVisibility(View.GONE);
                                tht4 = false;
                            }
                        }
                    });
                    thur25.setVisibility(View.VISIBLE);
                    thur25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht5 == false) {
                                y5.setVisibility(View.VISIBLE);
                                tht5 = true;
                            } else {
                                y5.setVisibility(View.GONE);
                                tht5 = false;
                            }
                        }
                    });
                    thur26.setVisibility(View.VISIBLE);
                    thur26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht6 == false) {
                                y6.setVisibility(View.VISIBLE);
                                tht6 = true;
                            } else {
                                y6.setVisibility(View.GONE);
                                tht6 = false;
                            }
                        }
                    });
                    th1 = true;
                } else {
                    thur21.setVisibility(View.GONE);
                    thur22.setVisibility(View.GONE);
                    thur23.setVisibility(View.GONE);
                    thur24.setVisibility(View.GONE);
                    thur25.setVisibility(View.GONE);
                    thur26.setVisibility(View.GONE);
                    y1.setVisibility(View.GONE);
                    y2.setVisibility(View.GONE);
                    y3.setVisibility(View.GONE);
                    y4.setVisibility(View.GONE);
                    y5.setVisibility(View.GONE);
                    y6.setVisibility(View.GONE);
                    th1 = false;
                }
            }
        });
        //<-----------------------------------THURSDAY #2-------------------------------------------------->
        this.thur3 = (Button) findViewById(R.id.thur3);
        this.thur31 = (Button) findViewById(R.id.thu31);
        this.thur32 = (Button) findViewById(R.id.thu32);
        this.thur33 = (Button) findViewById(R.id.thu33);
        this.thur34 = (Button) findViewById(R.id.thu34);
        this.thur35 = (Button) findViewById(R.id.thu35);
        this.thur36 = (Button) findViewById(R.id.thu36);
        this.y11 = (TextView) findViewById(R.id.thut11);
        this.y12 = (TextView) findViewById(R.id.thut12);
        this.y13 = (TextView) findViewById(R.id.thut13);
        this.y14 = (TextView) findViewById(R.id.thut14);
        this.y15 = (TextView) findViewById(R.id.thut15);
        this.y16 = (TextView) findViewById(R.id.thut16);
        this.thur3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th2 == false) {
                    thur31.setVisibility(View.VISIBLE);
                    thur31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht11 == false) {
                                y11.setVisibility(View.VISIBLE);
                                tht11 = true;
                            } else {
                                y11.setVisibility(View.GONE);
                                tht11 = false;
                            }
                        }
                    });
                    thur32.setVisibility(View.VISIBLE);
                    thur32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht12 == false) {
                                y12.setVisibility(View.VISIBLE);
                                tht12 = true;
                            } else {
                                y12.setVisibility(View.GONE);
                                tht12 = false;
                            }
                        }
                    });
                    thur33.setVisibility(View.VISIBLE);
                    thur33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht13 == false) {
                                y13.setVisibility(View.VISIBLE);
                                tht13 = true;
                            } else {
                                y13.setVisibility(View.GONE);
                                tht13 = false;
                            }
                        }
                    });
                    thur34.setVisibility(View.VISIBLE);
                    thur34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht14 == false) {
                                y14.setVisibility(View.VISIBLE);
                                tht14 = true;
                            } else {
                                y14.setVisibility(View.GONE);
                                tht14 = false;
                            }
                        }
                    });
                    thur35.setVisibility(View.VISIBLE);
                    thur35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht15 == false) {
                                y15.setVisibility(View.VISIBLE);
                                tht15 = true;
                            } else {
                                y15.setVisibility(View.GONE);
                                tht15 = false;
                            }
                        }
                    });
                    thur36.setVisibility(View.VISIBLE);
                    thur36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht16 == false) {
                                y16.setVisibility(View.VISIBLE);
                                tht16 = true;
                            } else {
                                y16.setVisibility(View.GONE);
                                tht16 = false;
                            }
                        }
                    });
                    th2 = true;
                } else {
                    thur31.setVisibility(View.GONE);
                    thur32.setVisibility(View.GONE);
                    thur33.setVisibility(View.GONE);
                    thur34.setVisibility(View.GONE);
                    thur35.setVisibility(View.GONE);
                    thur36.setVisibility(View.GONE);
                    y11.setVisibility(View.GONE);
                    y12.setVisibility(View.GONE);
                    y13.setVisibility(View.GONE);
                    y14.setVisibility(View.GONE);
                    y15.setVisibility(View.GONE);
                    y16.setVisibility(View.GONE);
                    th2 = false;
                }
            }
        });
        //<------------------------------------------------------THURSDAY #3----------------------------------------------->
        this.thur4 = (Button) findViewById(R.id.thur4);
        this.thur41 = (Button) findViewById(R.id.thu41);
        this.thur42 = (Button) findViewById(R.id.thu42);
        this.thur43 = (Button) findViewById(R.id.thu43);
        this.thur44 = (Button) findViewById(R.id.thu44);
        this.thur45 = (Button) findViewById(R.id.thu45);
        this.y21 = (TextView) findViewById(R.id.thut21);
        this.y22 = (TextView) findViewById(R.id.thut22);
        this.y23 = (TextView) findViewById(R.id.thut23);
        this.y24 = (TextView) findViewById(R.id.thut24);
        this.y25 = (TextView) findViewById(R.id.thut25);
        this.thur4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th3 == false) {
                    thur41.setVisibility(View.VISIBLE);
                    thur41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht21 == false) {
                                y21.setVisibility(View.VISIBLE);
                                tht21 = true;
                            } else {
                                y21.setVisibility(View.GONE);
                                tht21 = false;
                            }
                        }
                    });
                    thur42.setVisibility(View.VISIBLE);
                    thur42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht22 == false) {
                                y22.setVisibility(View.VISIBLE);
                                tht22 = true;
                            } else {
                                y22.setVisibility(View.GONE);
                                tht22 = false;
                            }
                        }
                    });
                    thur43.setVisibility(View.VISIBLE);
                    thur43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht23 == false) {
                                y23.setVisibility(View.VISIBLE);
                                tht23 = true;
                            } else {
                                y23.setVisibility(View.GONE);
                                tht23 = false;
                            }
                        }
                    });
                    thur44.setVisibility(View.VISIBLE);
                    thur44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht24 == false) {
                                y24.setVisibility(View.VISIBLE);
                                tht24 = true;
                            } else {
                                y24.setVisibility(View.GONE);
                                tht24 = false;
                            }
                        }
                    });
                    thur45.setVisibility(View.VISIBLE);
                    thur45.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht25 == false) {
                                y25.setVisibility(View.VISIBLE);
                                tht25 = true;
                            } else {
                                y25.setVisibility(View.GONE);
                                tht25 = false;
                            }
                        }
                    });
                    th3 = true;
                } else {
                    thur41.setVisibility(View.GONE);
                    thur42.setVisibility(View.GONE);
                    thur43.setVisibility(View.GONE);
                    thur44.setVisibility(View.GONE);
                    thur45.setVisibility(View.GONE);
                    y21.setVisibility(View.GONE);
                    y22.setVisibility(View.GONE);
                    y23.setVisibility(View.GONE);
                    y24.setVisibility(View.GONE);
                    y25.setVisibility(View.GONE);
                    th3 = false;
                }
            }
        });
        //<---------------------------------------THURSDAY #4--------------------------------------->
        this.thur5 = (Button) findViewById(R.id.thur5);
        this.thur51 = (Button) findViewById(R.id.thu51);
        this.thur52 = (Button) findViewById(R.id.thu52);
        this.thur53 = (Button) findViewById(R.id.thu53);
        this.thur54 = (Button) findViewById(R.id.thu54);
        this.thur55 = (Button) findViewById(R.id.thu55);
        this.thur56 = (Button) findViewById(R.id.thu56);
        this.y31 = (TextView) findViewById(R.id.thut31);
        this.y32 = (TextView) findViewById(R.id.thut32);
        this.y33 = (TextView) findViewById(R.id.thut33);
        this.y34 = (TextView) findViewById(R.id.thut34);
        this.y35 = (TextView) findViewById(R.id.thut35);
        this.y36 = (TextView) findViewById(R.id.thut36);
        this.thur5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th4 == false) {
                    thur51.setVisibility(View.VISIBLE);
                    thur51.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht31 == false) {
                                y31.setVisibility(View.VISIBLE);
                                tht31 = true;
                            } else {
                                y31.setVisibility(View.GONE);
                                tht31 = false;
                            }
                        }
                    });
                    thur52.setVisibility(View.VISIBLE);
                    thur52.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht32 == false) {
                                y32.setVisibility(View.VISIBLE);
                                tht32 = true;
                            } else {
                                y32.setVisibility(View.GONE);
                                tht32 = false;
                            }
                        }
                    });
                    thur53.setVisibility(View.VISIBLE);
                    thur53.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht33 == false) {
                                y33.setVisibility(View.VISIBLE);
                                tht33 = true;
                            } else {
                                y33.setVisibility(View.GONE);
                                tht33 = false;
                            }
                        }
                    });
                    thur54.setVisibility(View.VISIBLE);
                    thur54.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht34 == false) {
                                y34.setVisibility(View.VISIBLE);
                                tht34 = true;
                            } else {
                                y34.setVisibility(View.GONE);
                                tht34 = false;
                            }
                        }
                    });
                    thur55.setVisibility(View.VISIBLE);
                    thur55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht35 == false) {
                                y35.setVisibility(View.VISIBLE);
                                tht35 = true;
                            } else {
                                y35.setVisibility(View.GONE);
                                tht35 = false;
                            }
                        }
                    });
                    thur56.setVisibility(View.VISIBLE);
                    thur56.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht36 == false) {
                                y36.setVisibility(View.VISIBLE);
                                tht36 = true;
                            } else {
                                y36.setVisibility(View.GONE);
                                tht36 = false;
                            }
                        }
                    });
                    th4 = true;
                } else {
                    thur51.setVisibility(View.GONE);
                    thur52.setVisibility(View.GONE);
                    thur53.setVisibility(View.GONE);
                    thur54.setVisibility(View.GONE);
                    thur55.setVisibility(View.GONE);
                    thur56.setVisibility(View.GONE);
                    y31.setVisibility(View.GONE);
                    y32.setVisibility(View.GONE);
                    y33.setVisibility(View.GONE);
                    y34.setVisibility(View.GONE);
                    y35.setVisibility(View.GONE);
                    y36.setVisibility(View.GONE);
                    th4 = false;
                }
            }
        });
        //<-------------------------------------------THURSDAY #5------------------------------------->
        this.thur6 = (Button) findViewById(R.id.thur6);
        this.thur61 = (Button) findViewById(R.id.thu61);
        this.thur62 = (Button) findViewById(R.id.thu62);
        this.thur63 = (Button) findViewById(R.id.thu63);
        this.thur64 = (Button) findViewById(R.id.thu64);
        this.thur65 = (Button) findViewById(R.id.thu65);
        this.thur66 = (Button) findViewById(R.id.thu66);
        this.y41 = (TextView) findViewById(R.id.thut41);
        this.y42 = (TextView) findViewById(R.id.thut42);
        this.y43 = (TextView) findViewById(R.id.thut43);
        this.y44 = (TextView) findViewById(R.id.thut44);
        this.y45 = (TextView) findViewById(R.id.thut45);
        this.y46 = (TextView) findViewById(R.id.thut46);
        this.thur6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th5 == false) {
                    thur61.setVisibility(View.VISIBLE);
                    thur61.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht41 == false) {
                                y41.setVisibility(View.VISIBLE);
                                tht41 = true;
                            } else {
                                y41.setVisibility(View.GONE);
                                tht41 = false;
                            }
                        }
                    });
                    thur62.setVisibility(View.VISIBLE);
                    thur62.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht42 == false) {
                                y42.setVisibility(View.VISIBLE);
                                tht42 = true;
                            } else {
                                y42.setVisibility(View.GONE);
                                tht42 = false;
                            }
                        }
                    });
                    thur63.setVisibility(View.VISIBLE);
                    thur63.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht43 == false) {
                                y43.setVisibility(View.VISIBLE);
                                tht43 = true;
                            } else {
                                y43.setVisibility(View.GONE);
                                tht43 = false;
                            }
                        }
                    });
                    thur64.setVisibility(View.VISIBLE);
                    thur64.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht44 == false) {
                                y44.setVisibility(View.VISIBLE);
                                tht44 = true;
                            } else {
                                y44.setVisibility(View.GONE);
                                tht44 = false;
                            }
                        }
                    });
                    thur65.setVisibility(View.VISIBLE);
                    thur65.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht45 == false) {
                                y45.setVisibility(View.VISIBLE);
                                tht45 = true;
                            } else {
                                y45.setVisibility(View.GONE);
                                tht45 = false;
                            }
                        }
                    });
                    thur66.setVisibility(View.VISIBLE);
                    thur66.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht46 == false) {
                                y46.setVisibility(View.VISIBLE);
                                tht46 = true;
                            } else {
                                y46.setVisibility(View.GONE);
                                tht46 = false;
                            }
                        }
                    });
                    th5 = true;
                } else {
                    thur61.setVisibility(View.GONE);
                    thur62.setVisibility(View.GONE);
                    thur63.setVisibility(View.GONE);
                    thur64.setVisibility(View.GONE);
                    thur65.setVisibility(View.GONE);
                    thur66.setVisibility(View.GONE);
                    y41.setVisibility(View.GONE);
                    y42.setVisibility(View.GONE);
                    y43.setVisibility(View.GONE);
                    y44.setVisibility(View.GONE);
                    y45.setVisibility(View.GONE);
                    y46.setVisibility(View.GONE);
                    th5 = false;
                }
            }
        });
        //<---------------------------THURSDAY #6------------------------------------------------>
        this.thur7 = (Button) findViewById(R.id.thur7);
        this.thur71 = (Button) findViewById(R.id.thu71);
        this.thur72 = (Button) findViewById(R.id.thu72);
        this.thur73 = (Button) findViewById(R.id.thu73);
        this.thur74 = (Button) findViewById(R.id.thu74);
        this.thur75 = (Button) findViewById(R.id.thu75);
        this.thur76 = (Button) findViewById(R.id.thu76);
        this.y51 = (TextView) findViewById(R.id.thut51);
        this.y52 = (TextView) findViewById(R.id.thut52);
        this.y53 = (TextView) findViewById(R.id.thut53);
        this.y54 = (TextView) findViewById(R.id.thut54);
        this.y55 = (TextView) findViewById(R.id.thut55);
        this.y56 = (TextView) findViewById(R.id.thut56);
        this.thur7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th6 == false) {
                    thur71.setVisibility(View.VISIBLE);
                    thur71.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht51 == false) {
                                y51.setVisibility(View.VISIBLE);
                                tht51 = true;
                            } else {
                                y51.setVisibility(View.GONE);
                                tht51 = false;
                            }
                        }
                    });
                    thur72.setVisibility(View.VISIBLE);
                    thur72.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht52 == false) {
                                y52.setVisibility(View.VISIBLE);
                                tht52 = true;
                            } else {
                                y52.setVisibility(View.GONE);
                                tht52 = false;
                            }
                        }
                    });
                    thur73.setVisibility(View.VISIBLE);
                    thur73.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht53 == false) {
                                y53.setVisibility(View.VISIBLE);
                                tht53 = true;
                            } else {
                                y53.setVisibility(View.GONE);
                                tht53 = false;
                            }
                        }
                    });
                    thur74.setVisibility(View.VISIBLE);
                    thur74.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht54 == false) {
                                y54.setVisibility(View.VISIBLE);
                                tht54 = true;
                            } else {
                                y54.setVisibility(View.GONE);
                                tht54 = false;
                            }
                        }
                    });
                    thur75.setVisibility(View.VISIBLE);
                    thur75.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht55 == false) {
                                y55.setVisibility(View.VISIBLE);
                                tht55 = true;
                            } else {
                                y55.setVisibility(View.GONE);
                                tht55 = false;
                            }
                        }
                    });
                    thur76.setVisibility(View.VISIBLE);
                    thur76.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht56 == false) {
                                y56.setVisibility(View.VISIBLE);
                                tht56 = true;
                            } else {
                                y56.setVisibility(View.GONE);
                                tht56 = false;
                            }
                        }
                    });
                    th6 = true;
                } else {
                    thur71.setVisibility(View.GONE);
                    thur72.setVisibility(View.GONE);
                    thur73.setVisibility(View.GONE);
                    thur74.setVisibility(View.GONE);
                    thur75.setVisibility(View.GONE);
                    thur76.setVisibility(View.GONE);
                    y51.setVisibility(View.GONE);
                    y52.setVisibility(View.GONE);
                    y53.setVisibility(View.GONE);
                    y54.setVisibility(View.GONE);
                    y55.setVisibility(View.GONE);
                    y56.setVisibility(View.GONE);
                    th6 = false;
                }
            }
        });
        //<-------------------------------THURSDAY #7-------------------------------->
        this.thur8 = (Button) findViewById(R.id.thur8);
        this.thur81 = (Button) findViewById(R.id.thu81);
        this.thur82 = (Button) findViewById(R.id.thu82);
        this.thur83 = (Button) findViewById(R.id.thu83);
        this.thur84 = (Button) findViewById(R.id.thu84);
        this.thur85 = (Button) findViewById(R.id.thu85);
        this.thur86 = (Button) findViewById(R.id.thu86);
        this.y61 = (TextView) findViewById(R.id.thut61);
        this.y62 = (TextView) findViewById(R.id.thut62);
        this.y63 = (TextView) findViewById(R.id.thut63);
        this.y64 = (TextView) findViewById(R.id.thut64);
        this.y65 = (TextView) findViewById(R.id.thut65);
        this.y66 = (TextView) findViewById(R.id.thut66);
        this.thur8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th7 == false) {
                    thur81.setVisibility(View.VISIBLE);
                    thur81.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht61 == false) {
                                y61.setVisibility(View.VISIBLE);
                                tht61 = true;
                            } else {
                                y61.setVisibility(View.GONE);
                                tht61 = false;
                            }
                        }
                    });
                    thur82.setVisibility(View.VISIBLE);
                    thur82.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht62 == false) {
                                y62.setVisibility(View.VISIBLE);
                                tht62 = true;
                            } else {
                                y62.setVisibility(View.GONE);
                                tht62 = false;
                            }
                        }
                    });
                    thur83.setVisibility(View.VISIBLE);
                    thur83.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht63 == false) {
                                y63.setVisibility(View.VISIBLE);
                                tht63 = true;
                            } else {
                                y63.setVisibility(View.GONE);
                                tht63 = false;
                            }
                        }
                    });
                    thur84.setVisibility(View.VISIBLE);
                    thur84.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht64 == false) {
                                y64.setVisibility(View.VISIBLE);
                                tht64 = true;
                            } else {
                                y64.setVisibility(View.GONE);
                                tht64 = false;
                            }
                        }
                    });
                    thur85.setVisibility(View.VISIBLE);
                    thur85.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht65 == false) {
                                y65.setVisibility(View.VISIBLE);
                                tht65 = true;
                            } else {
                                y65.setVisibility(View.GONE);
                                tht65 = false;
                            }
                        }
                    });
                    thur86.setVisibility(View.VISIBLE);
                    thur86.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht66 == false) {
                                y66.setVisibility(View.VISIBLE);
                                tht66 = true;
                            } else {
                                y66.setVisibility(View.GONE);
                                tht66 = false;
                            }
                        }
                    });
                    th7 = true;
                } else {
                    thur81.setVisibility(View.GONE);
                    thur82.setVisibility(View.GONE);
                    thur83.setVisibility(View.GONE);
                    thur84.setVisibility(View.GONE);
                    thur85.setVisibility(View.GONE);
                    thur86.setVisibility(View.GONE);
                    y61.setVisibility(View.GONE);
                    y62.setVisibility(View.GONE);
                    y63.setVisibility(View.GONE);
                    y64.setVisibility(View.GONE);
                    y65.setVisibility(View.GONE);
                    y66.setVisibility(View.GONE);
                    th7 = false;
                }
            }
        });
        //<--------------------------------THURSDAY #8----------------------------------------------->
        this.thur9 = (Button) findViewById(R.id.thur9);
        this.thur91 = (Button) findViewById(R.id.thu91);
        this.thur92 = (Button) findViewById(R.id.thu92);
        this.thur93 = (Button) findViewById(R.id.thu93);
        this.thur94 = (Button) findViewById(R.id.thu94);
        this.thur95 = (Button) findViewById(R.id.thu95);
        this.thur96 = (Button) findViewById(R.id.thu96);
        this.y71 = (TextView) findViewById(R.id.thut71);
        this.y72 = (TextView) findViewById(R.id.thut72);
        this.y73 = (TextView) findViewById(R.id.thut73);
        this.y74 = (TextView) findViewById(R.id.thut74);
        this.y75 = (TextView) findViewById(R.id.thut75);
        this.y76 = (TextView) findViewById(R.id.thut76);
        this.thur9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th8 == false) {
                    thur91.setVisibility(View.VISIBLE);
                    thur91.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht71 == false) {
                                y71.setVisibility(View.VISIBLE);
                                tht71 = true;
                            } else {
                                y71.setVisibility(View.GONE);
                                tht71 = false;
                            }
                        }
                    });
                    thur92.setVisibility(View.VISIBLE);
                    thur92.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht72 == false) {
                                y72.setVisibility(View.VISIBLE);
                                tht72 = true;
                            } else {
                                y72.setVisibility(View.GONE);
                                tht72 = false;
                            }
                        }
                    });
                    thur93.setVisibility(View.VISIBLE);
                    thur93.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht73 == false) {
                                y73.setVisibility(View.VISIBLE);
                                tht73 = true;
                            } else {
                                y73.setVisibility(View.GONE);
                                tht73 = false;
                            }
                        }
                    });
                    thur94.setVisibility(View.VISIBLE);
                    thur94.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht74 == false) {
                                y74.setVisibility(View.VISIBLE);
                                tht74 = true;
                            } else {
                                y74.setVisibility(View.GONE);
                                tht74 = false;
                            }
                        }
                    });
                    thur95.setVisibility(View.VISIBLE);
                    thur95.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht75 == false) {
                                y75.setVisibility(View.VISIBLE);
                                tht75 = true;
                            } else {
                                y75.setVisibility(View.GONE);
                                tht75 = false;
                            }
                        }
                    });
                    thur96.setVisibility(View.VISIBLE);
                    thur96.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht76 == false) {
                                y76.setVisibility(View.VISIBLE);
                                tht76 = true;
                            } else {
                                y76.setVisibility(View.GONE);
                                tht76 = false;
                            }
                        }
                    });
                    th8 = true;
                } else {
                    thur91.setVisibility(View.GONE);
                    thur92.setVisibility(View.GONE);
                    thur93.setVisibility(View.GONE);
                    thur94.setVisibility(View.GONE);
                    thur95.setVisibility(View.GONE);
                    thur96.setVisibility(View.GONE);
                    y71.setVisibility(View.GONE);
                    y72.setVisibility(View.GONE);
                    y73.setVisibility(View.GONE);
                    y74.setVisibility(View.GONE);
                    y75.setVisibility(View.GONE);
                    y76.setVisibility(View.GONE);
                    th8 = false;
                }
            }
        });
        //<-------------------------------------THURSDAY #9------------------------------------->
        this.thur10 = (Button) findViewById(R.id.thur10);
        this.thur101 = (Button) findViewById(R.id.thu101);
        this.thur102 = (Button) findViewById(R.id.thu102);
        this.thur103 = (Button) findViewById(R.id.thu103);
        this.thur104 = (Button) findViewById(R.id.thu104);
        this.thur105 = (Button) findViewById(R.id.thu105);
        this.thur106 = (Button) findViewById(R.id.thu106);
        this.y81 = (TextView) findViewById(R.id.thut81);
        this.y82 = (TextView) findViewById(R.id.thut82);
        this.y83 = (TextView) findViewById(R.id.thut83);
        this.y84 = (TextView) findViewById(R.id.thut84);
        this.y85 = (TextView) findViewById(R.id.thut85);
        this.y86 = (TextView) findViewById(R.id.thut86);
        this.thur10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th9 == false) {
                    thur101.setVisibility(View.VISIBLE);
                    thur101.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht81 == false) {
                                y81.setVisibility(View.VISIBLE);
                                tht81 = true;
                            } else {
                                y81.setVisibility(View.GONE);
                                tht81 = false;
                            }
                        }
                    });
                    thur102.setVisibility(View.VISIBLE);
                    thur102.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht82 == false) {
                                y82.setVisibility(View.VISIBLE);
                                tht82 = true;
                            } else {
                                y82.setVisibility(View.GONE);
                                tht82 = false;
                            }
                        }
                    });
                    thur103.setVisibility(View.VISIBLE);
                    thur103.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht83 == false) {
                                y83.setVisibility(View.VISIBLE);
                                tht83 = true;
                            } else {
                                y83.setVisibility(View.GONE);
                                tht83 = false;
                            }
                        }
                    });
                    thur104.setVisibility(View.VISIBLE);
                    thur104.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht84 == false) {
                                y84.setVisibility(View.VISIBLE);
                                tht84 = true;
                            } else {
                                y84.setVisibility(View.GONE);
                                tht84 = false;
                            }
                        }
                    });
                    thur105.setVisibility(View.VISIBLE);
                    thur105.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht85 == false) {
                                y85.setVisibility(View.VISIBLE);
                                tht85 = true;
                            } else {
                                y85.setVisibility(View.GONE);
                                tht85 = false;
                            }
                        }
                    });
                    thur106.setVisibility(View.VISIBLE);
                    thur106.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht86 == false) {
                                y86.setVisibility(View.VISIBLE);
                                tht86 = true;
                            } else {
                                y86.setVisibility(View.GONE);
                                tht86 = false;
                            }
                        }
                    });
                    th9 = true;
                } else {
                    thur101.setVisibility(View.GONE);
                    thur102.setVisibility(View.GONE);
                    thur103.setVisibility(View.GONE);
                    thur104.setVisibility(View.GONE);
                    thur105.setVisibility(View.GONE);
                    thur106.setVisibility(View.GONE);
                    y81.setVisibility(View.GONE);
                    y82.setVisibility(View.GONE);
                    y83.setVisibility(View.GONE);
                    y84.setVisibility(View.GONE);
                    y85.setVisibility(View.GONE);
                    y86.setVisibility(View.GONE);
                    th9 = false;
                }
            }
        });
        //<--------------------------------THURSDAY #10-------------------------------->
        this.thur11 = (Button) findViewById(R.id.thur11);
        this.thur111 = (Button) findViewById(R.id.thu111);
        this.thur112 = (Button) findViewById(R.id.thu112);
        this.thur113 = (Button) findViewById(R.id.thu113);
        this.thur114 = (Button) findViewById(R.id.thu114);
        this.thur115 = (Button) findViewById(R.id.thu115);
        this.thur116 = (Button) findViewById(R.id.thu116);
        this.y91 = (TextView) findViewById(R.id.thut91);
        this.y92 = (TextView) findViewById(R.id.thut92);
        this.y93 = (TextView) findViewById(R.id.thut93);
        this.y94 = (TextView) findViewById(R.id.thut94);
        this.y95 = (TextView) findViewById(R.id.thut95);
        this.y96 = (TextView) findViewById(R.id.thut96);
        this.thur11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th10 == false) {
                    thur111.setVisibility(View.VISIBLE);
                    thur111.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht91 == false) {
                                y91.setVisibility(View.VISIBLE);
                                tht91 = true;
                            } else {
                                y91.setVisibility(View.GONE);
                                tht91 = false;
                            }
                        }
                    });
                    thur112.setVisibility(View.VISIBLE);
                    thur112.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht92 == false) {
                                y92.setVisibility(View.VISIBLE);
                                tht92 = true;
                            } else {
                                y92.setVisibility(View.GONE);
                                tht92 = false;
                            }
                        }
                    });
                    thur113.setVisibility(View.VISIBLE);
                    thur113.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht93 == false) {
                                y93.setVisibility(View.VISIBLE);
                                tht93 = true;
                            } else {
                                y93.setVisibility(View.GONE);
                                tht93 = false;
                            }
                        }
                    });
                    thur114.setVisibility(View.VISIBLE);
                    thur114.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht94 == false) {
                                y94.setVisibility(View.VISIBLE);
                                tht94 = true;
                            } else {
                                y94.setVisibility(View.GONE);
                                tht94 = false;
                            }
                        }
                    });
                    thur115.setVisibility(View.VISIBLE);
                    thur115.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht95 == false) {
                                y95.setVisibility(View.VISIBLE);
                                tht95 = true;
                            } else {
                                y95.setVisibility(View.GONE);
                                tht95 = false;
                            }
                        }
                    });
                    thur116.setVisibility(View.VISIBLE);
                    thur116.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht96 == false) {
                                y96.setVisibility(View.VISIBLE);
                                tht96 = true;
                            } else {
                                y96.setVisibility(View.GONE);
                                tht96 = false;
                            }
                        }
                    });
                    th10 = true;
                } else {
                    thur111.setVisibility(View.GONE);
                    thur112.setVisibility(View.GONE);
                    thur113.setVisibility(View.GONE);
                    thur114.setVisibility(View.GONE);
                    thur115.setVisibility(View.GONE);
                    thur116.setVisibility(View.GONE);
                    y91.setVisibility(View.GONE);
                    y92.setVisibility(View.GONE);
                    y93.setVisibility(View.GONE);
                    y94.setVisibility(View.GONE);
                    y95.setVisibility(View.GONE);
                    y96.setVisibility(View.GONE);
                    th10 = false;
                }
            }
        });
        //<--------------------------------------------THURSDAY #11----------------------------------------------->
        this.thur12 = (Button) findViewById(R.id.thur12);
        this.thur121 = (Button) findViewById(R.id.thu121);
        this.thur122 = (Button) findViewById(R.id.thu122);
        this.thur123 = (Button) findViewById(R.id.thu123);
        this.thur124 = (Button) findViewById(R.id.thu124);
        this.thur125 = (Button) findViewById(R.id.thu125);
        this.thur126 = (Button) findViewById(R.id.thu126);
        this.y101 = (TextView) findViewById(R.id.thut101);
        this.y102 = (TextView) findViewById(R.id.thut102);
        this.y103 = (TextView) findViewById(R.id.thut103);
        this.y104 = (TextView) findViewById(R.id.thut104);
        this.y105 = (TextView) findViewById(R.id.thut105);
        this.y106 = (TextView) findViewById(R.id.thut106);
        this.thur12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th11 == false) {
                    thur121.setVisibility(View.VISIBLE);
                    thur121.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht101 == false) {
                                y101.setVisibility(View.VISIBLE);
                                tht101 = true;
                            } else {
                                y101.setVisibility(View.GONE);
                                tht101 = false;
                            }
                        }
                    });
                    thur122.setVisibility(View.VISIBLE);
                    thur122.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht102 == false) {
                                y102.setVisibility(View.VISIBLE);
                                tht102 = true;
                            } else {
                                y102.setVisibility(View.GONE);
                                tht102 = false;
                            }
                        }
                    });
                    thur123.setVisibility(View.VISIBLE);
                    thur123.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht103 == false) {
                                y103.setVisibility(View.VISIBLE);
                                tht103 = true;
                            } else {
                                y103.setVisibility(View.GONE);
                                tht103 = false;
                            }
                        }
                    });
                    thur124.setVisibility(View.VISIBLE);
                    thur124.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht104 == false) {
                                y104.setVisibility(View.VISIBLE);
                                tht104 = true;
                            } else {
                                y104.setVisibility(View.GONE);
                                tht104 = false;
                            }
                        }
                    });
                    thur125.setVisibility(View.VISIBLE);
                    thur125.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht105 == false) {
                                y105.setVisibility(View.VISIBLE);
                                tht105 = true;
                            } else {
                                y105.setVisibility(View.GONE);
                                tht105 = false;
                            }
                        }
                    });
                    thur126.setVisibility(View.VISIBLE);
                    thur126.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht106 == false) {
                                y106.setVisibility(View.VISIBLE);
                                tht106 = true;
                            } else {
                                y106.setVisibility(View.GONE);
                                tht106 = false;
                            }
                        }
                    });
                    th11 = true;
                } else {
                    thur121.setVisibility(View.GONE);
                    thur122.setVisibility(View.GONE);
                    thur123.setVisibility(View.GONE);
                    thur124.setVisibility(View.GONE);
                    thur125.setVisibility(View.GONE);
                    thur126.setVisibility(View.GONE);
                    y101.setVisibility(View.GONE);
                    y102.setVisibility(View.GONE);
                    y103.setVisibility(View.GONE);
                    y104.setVisibility(View.GONE);
                    y105.setVisibility(View.GONE);
                    y106.setVisibility(View.GONE);
                    th11 = false;
                }
            }
        });
        //<--------------------------------------------THURSDAY #12------------------------------------------------>
        this.thur13 = (Button) findViewById(R.id.thur13);
        this.thur131 = (Button) findViewById(R.id.thu131);
        this.thur132 = (Button) findViewById(R.id.thu132);
        this.thur133 = (Button) findViewById(R.id.thu133);
        this.thur134 = (Button) findViewById(R.id.thu134);
        this.thur135 = (Button) findViewById(R.id.thu135);
        this.thur136 = (Button) findViewById(R.id.thu136);
        this.y111 = (TextView) findViewById(R.id.thut111);
        this.y112 = (TextView) findViewById(R.id.thut112);
        this.y113 = (TextView) findViewById(R.id.thut113);
        this.y114 = (TextView) findViewById(R.id.thut114);
        this.y115 = (TextView) findViewById(R.id.thut115);
        this.y116 = (TextView) findViewById(R.id.thut116);
        this.thur13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th12 == false) {
                    thur131.setVisibility(View.VISIBLE);
                    thur131.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht111 == false) {
                                y111.setVisibility(View.VISIBLE);
                                tht111 = true;
                            } else {
                                y111.setVisibility(View.GONE);
                                tht111 = false;
                            }
                        }
                    });
                    thur132.setVisibility(View.VISIBLE);
                    thur132.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht112 == false) {
                                y112.setVisibility(View.VISIBLE);
                                tht112 = true;
                            } else {
                                y112.setVisibility(View.GONE);
                                tht112 = false;
                            }
                        }
                    });
                    thur133.setVisibility(View.VISIBLE);
                    thur133.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht113 == false) {
                                y113.setVisibility(View.VISIBLE);
                                tht113 = true;
                            } else {
                                y113.setVisibility(View.GONE);
                                tht113 = false;
                            }
                        }
                    });
                    thur134.setVisibility(View.VISIBLE);
                    thur134.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht114 == false) {
                                y114.setVisibility(View.VISIBLE);
                                tht114 = true;
                            } else {
                                y114.setVisibility(View.GONE);
                                tht114 = false;
                            }
                        }
                    });
                    thur135.setVisibility(View.VISIBLE);
                    thur135.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht115 == false) {
                                y115.setVisibility(View.VISIBLE);
                                tht115 = true;
                            } else {
                                y115.setVisibility(View.GONE);
                                tht115 = false;
                            }
                        }
                    });
                    thur136.setVisibility(View.VISIBLE);
                    thur136.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht116 == false) {
                                y116.setVisibility(View.VISIBLE);
                                tht116 = true;
                            } else {
                                y116.setVisibility(View.GONE);
                                tht116 = false;
                            }
                        }
                    });
                    th12 = true;
                } else {
                    thur131.setVisibility(View.GONE);
                    thur132.setVisibility(View.GONE);
                    thur133.setVisibility(View.GONE);
                    thur134.setVisibility(View.GONE);
                    thur135.setVisibility(View.GONE);
                    thur136.setVisibility(View.GONE);
                    y111.setVisibility(View.GONE);
                    y112.setVisibility(View.GONE);
                    y113.setVisibility(View.GONE);
                    y114.setVisibility(View.GONE);
                    y115.setVisibility(View.GONE);
                    y116.setVisibility(View.GONE);
                    th12 = false;
                }
            }
        });
        //<--------------------------------------THURSDAY #13-------------------------------------------------------->
        this.thur14 = (Button) findViewById(R.id.thur14);
        this.thur141 = (Button) findViewById(R.id.thu141);
        this.thur142 = (Button) findViewById(R.id.thu142);
        this.thur143 = (Button) findViewById(R.id.thu143);
        this.thur144 = (Button) findViewById(R.id.thu144);
        this.thur145 = (Button) findViewById(R.id.thu145);
        this.thur146 = (Button) findViewById(R.id.thu146);
        this.y121 = (TextView) findViewById(R.id.thut121);
        this.y122 = (TextView) findViewById(R.id.thut122);
        this.y123 = (TextView) findViewById(R.id.thut123);
        this.y124 = (TextView) findViewById(R.id.thut124);
        this.y125 = (TextView) findViewById(R.id.thut125);
        this.y126 = (TextView) findViewById(R.id.thut126);
        this.thur14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (th13 == false) {
                    thur141.setVisibility(View.VISIBLE);
                    thur141.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht121 == false) {
                                y121.setVisibility(View.VISIBLE);
                                tht121 = true;
                            } else {
                                y121.setVisibility(View.GONE);
                                tht121 = false;
                            }
                        }
                    });
                    thur142.setVisibility(View.VISIBLE);
                    thur142.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht122 == false) {
                                y122.setVisibility(View.VISIBLE);
                                tht122 = true;
                            } else {
                                y122.setVisibility(View.GONE);
                                tht122 = false;
                            }
                        }
                    });
                    thur143.setVisibility(View.VISIBLE);
                    thur143.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht123 == false) {
                                y123.setVisibility(View.VISIBLE);
                                tht123 = true;
                            } else {
                                y123.setVisibility(View.GONE);
                                tht123 = false;
                            }
                        }
                    });
                    thur144.setVisibility(View.VISIBLE);
                    thur144.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht124 == false) {
                                y124.setVisibility(View.VISIBLE);
                                tht124 = true;
                            } else {
                                y124.setVisibility(View.GONE);
                                tht124 = false;
                            }
                        }
                    });
                    thur145.setVisibility(View.VISIBLE);
                    thur145.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht125 == false) {
                                y125.setVisibility(View.VISIBLE);
                                tht125 = true;
                            } else {
                                y125.setVisibility(View.GONE);
                                tht125 = false;
                            }
                        }
                    });
                    thur146.setVisibility(View.VISIBLE);
                    thur146.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (tht126 == false) {
                                y126.setVisibility(View.VISIBLE);
                                tht126 = true;
                            } else {
                                y126.setVisibility(View.GONE);
                                tht126 = false;
                            }
                        }
                    });
                    th13 = true;
                } else {
                    thur141.setVisibility(View.GONE);
                    thur142.setVisibility(View.GONE);
                    thur143.setVisibility(View.GONE);
                    thur144.setVisibility(View.GONE);
                    thur145.setVisibility(View.GONE);
                    thur146.setVisibility(View.GONE);
                    y121.setVisibility(View.GONE);
                    y122.setVisibility(View.GONE);
                    y123.setVisibility(View.GONE);
                    y124.setVisibility(View.GONE);
                    y125.setVisibility(View.GONE);
                    y126.setVisibility(View.GONE);
                    th13 = false;
                }
            }
        });
        //<-----------------------------------------------------FRIDAY #1---------------------------------------------------------->
        this.fri2 = (Button) findViewById(R.id.fri2);
        this.fri21 = (Button) findViewById(R.id.fri21);
        this.fri22 = (Button) findViewById(R.id.fri22);
        this.fri23 = (Button) findViewById(R.id.fri23);
        this.fri24 = (Button) findViewById(R.id.fri24);
        this.fri25 = (Button) findViewById(R.id.fri25);
        this.fri26 = (Button) findViewById(R.id.fri26);
        this.z1 = (TextView) findViewById(R.id.frit1);
        this.z2 = (TextView) findViewById(R.id.frit2);
        this.z3 = (TextView) findViewById(R.id.frit3);
        this.z4 = (TextView) findViewById(R.id.frit4);
        this.z5 = (TextView) findViewById(R.id.frit5);
        this.z6 = (TextView) findViewById(R.id.frit6);
        this.fri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f1 == false) {
                    fri21.setVisibility(View.VISIBLE);
                    fri21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft1 == false) {
                                z1.setVisibility(View.VISIBLE);
                                ft1 = true;
                            } else {
                                z1.setVisibility(View.GONE);
                                ft1 = false;
                            }
                        }
                    });
                    fri22.setVisibility(View.VISIBLE);
                    fri22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft2 == false) {
                                z2.setVisibility(View.VISIBLE);
                                ft2 = true;
                            } else {
                                z2.setVisibility(View.GONE);
                                ft2 = false;
                            }
                        }
                    });
                    fri23.setVisibility(View.VISIBLE);
                    fri23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft3 == false) {
                                z3.setVisibility(View.VISIBLE);
                                ft3 = true;
                            } else {
                                z3.setVisibility(View.GONE);
                                ft3 = false;
                            }
                        }
                    });
                    fri24.setVisibility(View.VISIBLE);
                    fri24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft4 == false) {
                                z4.setVisibility(View.VISIBLE);
                                ft4 = true;
                            } else {
                                z4.setVisibility(View.GONE);
                                ft4 = false;
                            }
                        }
                    });
                    fri25.setVisibility(View.VISIBLE);
                    fri25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft5 == false) {
                                z5.setVisibility(View.VISIBLE);
                                ft5 = true;
                            } else {
                                z5.setVisibility(View.GONE);
                                ft5 = false;
                            }
                        }
                    });
                    fri26.setVisibility(View.VISIBLE);
                    fri26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft6 == false) {
                                z6.setVisibility(View.VISIBLE);
                                ft6 = true;
                            } else {
                                z6.setVisibility(View.GONE);
                                ft6 = false;
                            }
                        }
                    });
                    f1 = true;
                } else {
                    fri21.setVisibility(View.GONE);
                    fri22.setVisibility(View.GONE);
                    fri23.setVisibility(View.GONE);
                    fri24.setVisibility(View.GONE);
                    fri25.setVisibility(View.GONE);
                    fri26.setVisibility(View.GONE);
                    z1.setVisibility(View.GONE);
                    z2.setVisibility(View.GONE);
                    z3.setVisibility(View.GONE);
                    z4.setVisibility(View.GONE);
                    z5.setVisibility(View.GONE);
                    z6.setVisibility(View.GONE);
                    f1 = false;
                }
            }
        });
        //<--------------------------------------FRIDAY #2------------------------------------------>
        this.fri3 = (Button) findViewById(R.id.fri3);
        this.fri31 = (Button) findViewById(R.id.fri31);
        this.fri32 = (Button) findViewById(R.id.fri32);
        this.fri33 = (Button) findViewById(R.id.fri33);
        this.fri34 = (Button) findViewById(R.id.fri34);
        this.fri35 = (Button) findViewById(R.id.fri35);
        this.fri36 = (Button) findViewById(R.id.fri36);
        this.z11 = (TextView) findViewById(R.id.frit11);
        this.z12 = (TextView) findViewById(R.id.frit12);
        this.z13 = (TextView) findViewById(R.id.frit13);
        this.z14 = (TextView) findViewById(R.id.frit14);
        this.z15 = (TextView) findViewById(R.id.frit15);
        this.z16 = (TextView) findViewById(R.id.frit16);
        this.fri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f2 == false) {
                    fri31.setVisibility(View.VISIBLE);
                    fri31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft11 == false) {
                                z11.setVisibility(View.VISIBLE);
                                ft11 = true;
                            } else {
                                z11.setVisibility(View.GONE);
                                ft11 = false;
                            }
                        }
                    });
                    fri32.setVisibility(View.VISIBLE);
                    fri32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft12 == false) {
                                z12.setVisibility(View.VISIBLE);
                                ft12 = true;
                            } else {
                                z12.setVisibility(View.GONE);
                                ft12 = false;
                            }
                        }
                    });
                    fri33.setVisibility(View.VISIBLE);
                    fri33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft13 == false) {
                                z13.setVisibility(View.VISIBLE);
                                ft13 = true;
                            } else {
                                z13.setVisibility(View.GONE);
                                ft13 = false;
                            }
                        }
                    });
                    fri34.setVisibility(View.VISIBLE);
                    fri34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft14 == false) {
                                z14.setVisibility(View.VISIBLE);
                                ft14 = true;
                            } else {
                                z14.setVisibility(View.GONE);
                                ft14 = false;
                            }
                        }
                    });
                    fri35.setVisibility(View.VISIBLE);
                    fri35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft15 == false) {
                                z15.setVisibility(View.VISIBLE);
                                ft15 = true;
                            } else {
                                z15.setVisibility(View.GONE);
                                ft15 = false;
                            }
                        }
                    });
                    fri36.setVisibility(View.VISIBLE);
                    fri36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft16 == false) {
                                z16.setVisibility(View.VISIBLE);
                                ft16 = true;
                            } else {
                                z16.setVisibility(View.GONE);
                                ft16 = false;
                            }
                        }
                    });
                    f2 = true;
                } else {
                    fri31.setVisibility(View.GONE);
                    fri32.setVisibility(View.GONE);
                    fri33.setVisibility(View.GONE);
                    fri34.setVisibility(View.GONE);
                    fri35.setVisibility(View.GONE);
                    fri36.setVisibility(View.GONE);
                    z11.setVisibility(View.GONE);
                    z12.setVisibility(View.GONE);
                    z13.setVisibility(View.GONE);
                    z14.setVisibility(View.GONE);
                    z15.setVisibility(View.GONE);
                    z16.setVisibility(View.GONE);
                    f2 = false;
                }
            }
        });
        //<--------------------------------FRIDAY #3---------------------------------------------->
        this.fri4 = (Button) findViewById(R.id.fri4);
        this.fri41 = (Button) findViewById(R.id.fri41);
        this.fri42 = (Button) findViewById(R.id.fri42);
        this.fri43 = (Button) findViewById(R.id.fri43);
        this.fri44 = (Button) findViewById(R.id.fri44);
        this.fri45 = (Button) findViewById(R.id.fri45);
        this.fri46 = (Button) findViewById(R.id.fri46);
        this.z21 = (TextView) findViewById(R.id.frit21);
        this.z22 = (TextView) findViewById(R.id.frit22);
        this.z23 = (TextView) findViewById(R.id.frit23);
        this.z24 = (TextView) findViewById(R.id.frit24);
        this.z25 = (TextView) findViewById(R.id.frit25);
        this.z26 = (TextView) findViewById(R.id.frit26);
        this.fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f3 == false) {
                    fri41.setVisibility(View.VISIBLE);
                    fri41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft21 == false) {
                                z21.setVisibility(View.VISIBLE);
                                ft21 = true;
                            } else {
                                z21.setVisibility(View.GONE);
                                ft21 = false;
                            }
                        }
                    });
                    fri42.setVisibility(View.VISIBLE);
                    fri42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft22 == false) {
                                z22.setVisibility(View.VISIBLE);
                                ft22 = true;
                            } else {
                                z22.setVisibility(View.GONE);
                                ft22 = false;
                            }
                        }
                    });
                    fri43.setVisibility(View.VISIBLE);
                    fri43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft23 == false) {
                                z23.setVisibility(View.VISIBLE);
                                ft23 = true;
                            } else {
                                z23.setVisibility(View.GONE);
                                ft23 = false;
                            }
                        }
                    });
                    fri44.setVisibility(View.VISIBLE);
                    fri44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft24 == false) {
                                z24.setVisibility(View.VISIBLE);
                                ft24 = true;
                            } else {
                                z24.setVisibility(View.GONE);
                                ft24 = false;
                            }
                        }
                    });
                    fri45.setVisibility(View.VISIBLE);
                    fri45.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft25 == false) {
                                z25.setVisibility(View.VISIBLE);
                                ft25 = true;
                            } else {
                                z25.setVisibility(View.GONE);
                                ft25 = false;
                            }
                        }
                    });
                    fri46.setVisibility(View.VISIBLE);
                    fri46.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft26 == false) {
                                z26.setVisibility(View.VISIBLE);
                                ft26 = true;
                            } else {
                                z26.setVisibility(View.GONE);
                                ft26 = false;
                            }
                        }
                    });
                    f3 = true;
                } else {
                    fri41.setVisibility(View.GONE);
                    fri42.setVisibility(View.GONE);
                    fri43.setVisibility(View.GONE);
                    fri44.setVisibility(View.GONE);
                    fri45.setVisibility(View.GONE);
                    fri46.setVisibility(View.GONE);
                    z21.setVisibility(View.GONE);
                    z22.setVisibility(View.GONE);
                    z23.setVisibility(View.GONE);
                    z24.setVisibility(View.GONE);
                    z25.setVisibility(View.GONE);
                    z26.setVisibility(View.GONE);
                    f3 = false;
                }
            }
        });
        //<----------------------------------------FRIDAY #4--------------------------------------------->
        this.fri5 = (Button) findViewById(R.id.fri5);
        this.fri51 = (Button) findViewById(R.id.fri51);
        this.fri52 = (Button) findViewById(R.id.fri52);
        this.fri53 = (Button) findViewById(R.id.fri53);
        this.fri54 = (Button) findViewById(R.id.fri54);
        this.fri55 = (Button) findViewById(R.id.fri55);
        this.fri56 = (Button) findViewById(R.id.fri56);
        this.z31 = (TextView) findViewById(R.id.frit31);
        this.z32 = (TextView) findViewById(R.id.frit32);
        this.z33 = (TextView) findViewById(R.id.frit33);
        this.z34 = (TextView) findViewById(R.id.frit34);
        this.z35 = (TextView) findViewById(R.id.frit35);
        this.z36 = (TextView) findViewById(R.id.frit36);
        this.fri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f4 == false) {
                    fri51.setVisibility(View.VISIBLE);
                    fri51.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft31 == false) {
                                z31.setVisibility(View.VISIBLE);
                                ft31 = true;
                            } else {
                                z31.setVisibility(View.GONE);
                                ft31 = false;
                            }
                        }
                    });
                    fri52.setVisibility(View.VISIBLE);
                    fri52.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft32 == false) {
                                z32.setVisibility(View.VISIBLE);
                                ft32 = true;
                            } else {
                                z32.setVisibility(View.GONE);
                                ft32 = false;
                            }
                        }
                    });
                    fri53.setVisibility(View.VISIBLE);
                    fri53.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft33 == false) {
                                z33.setVisibility(View.VISIBLE);
                                ft33 = true;
                            } else {
                                z33.setVisibility(View.GONE);
                                ft33 = false;
                            }
                        }
                    });
                    fri54.setVisibility(View.VISIBLE);
                    fri54.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft34 == false) {
                                z34.setVisibility(View.VISIBLE);
                                ft34 = true;
                            } else {
                                z34.setVisibility(View.GONE);
                                ft34 = false;
                            }
                        }
                    });
                    fri55.setVisibility(View.VISIBLE);
                    fri55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft35 == false) {
                                z35.setVisibility(View.VISIBLE);
                                ft35 = true;
                            } else {
                                z35.setVisibility(View.GONE);
                                ft35 = false;
                            }
                        }
                    });
                    fri56.setVisibility(View.VISIBLE);
                    fri56.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft36 == false) {
                                z36.setVisibility(View.VISIBLE);
                                ft36 = true;
                            } else {
                                z36.setVisibility(View.GONE);
                                ft36 = false;
                            }
                        }
                    });
                    f4 = true;
                } else {
                    fri51.setVisibility(View.GONE);
                    fri52.setVisibility(View.GONE);
                    fri53.setVisibility(View.GONE);
                    fri54.setVisibility(View.GONE);
                    fri55.setVisibility(View.GONE);
                    fri56.setVisibility(View.GONE);
                    z31.setVisibility(View.GONE);
                    z32.setVisibility(View.GONE);
                    z33.setVisibility(View.GONE);
                    z34.setVisibility(View.GONE);
                    z35.setVisibility(View.GONE);
                    z36.setVisibility(View.GONE);
                    f4 = false;
                }
            }
        });
        //<---------------------------------FRIDAY #5-------------------------------------------->
        this.fri6 = (Button) findViewById(R.id.fri6);
        this.fri61 = (Button) findViewById(R.id.fri61);
        this.fri62 = (Button) findViewById(R.id.fri62);
        this.fri63 = (Button) findViewById(R.id.fri63);
        this.fri64 = (Button) findViewById(R.id.fri64);
        this.fri65 = (Button) findViewById(R.id.fri65);
        this.fri66 = (Button) findViewById(R.id.fri66);
        this.z41 = (TextView) findViewById(R.id.frit41);
        this.z42 = (TextView) findViewById(R.id.frit42);
        this.z43 = (TextView) findViewById(R.id.frit43);
        this.z44 = (TextView) findViewById(R.id.frit44);
        this.z45 = (TextView) findViewById(R.id.frit45);
        this.z46 = (TextView) findViewById(R.id.frit46);
        this.fri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f5 == false) {
                    fri61.setVisibility(View.VISIBLE);
                    fri61.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft41 == false) {
                                z41.setVisibility(View.VISIBLE);
                                ft41 = true;
                            } else {
                                z41.setVisibility(View.GONE);
                                ft41 = false;
                            }
                        }
                    });
                    fri62.setVisibility(View.VISIBLE);
                    fri62.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft42 == false) {
                                z42.setVisibility(View.VISIBLE);
                                ft42 = true;
                            } else {
                                z42.setVisibility(View.GONE);
                                ft42 = false;
                            }
                        }
                    });
                    fri63.setVisibility(View.VISIBLE);
                    fri63.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft43 == false) {
                                z43.setVisibility(View.VISIBLE);
                                ft43 = true;
                            } else {
                                z43.setVisibility(View.GONE);
                                ft43 = false;
                            }
                        }
                    });
                    fri64.setVisibility(View.VISIBLE);
                    fri64.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft44 == false) {
                                z44.setVisibility(View.VISIBLE);
                                ft44 = true;
                            } else {
                                z44.setVisibility(View.GONE);
                                ft44 = false;
                            }
                        }
                    });
                    fri65.setVisibility(View.VISIBLE);
                    fri65.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft45 == false) {
                                z45.setVisibility(View.VISIBLE);
                                ft45 = true;
                            } else {
                                z45.setVisibility(View.GONE);
                                ft45 = false;
                            }
                        }
                    });
                    fri66.setVisibility(View.VISIBLE);
                    fri66.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft46 == false) {
                                z46.setVisibility(View.VISIBLE);
                                ft46 = true;
                            } else {
                                z46.setVisibility(View.GONE);
                                ft46 = false;
                            }
                        }
                    });
                    f5 = true;
                } else {
                    fri61.setVisibility(View.GONE);
                    fri62.setVisibility(View.GONE);
                    fri63.setVisibility(View.GONE);
                    fri64.setVisibility(View.GONE);
                    fri65.setVisibility(View.GONE);
                    fri66.setVisibility(View.GONE);
                    z41.setVisibility(View.GONE);
                    z42.setVisibility(View.GONE);
                    z43.setVisibility(View.GONE);
                    z44.setVisibility(View.GONE);
                    z45.setVisibility(View.GONE);
                    z46.setVisibility(View.GONE);
                    f5 = false;
                }
            }
        });
        //<---------------------------------FRIDAY #6-------------------------------------------------->
        this.fri7 = (Button) findViewById(R.id.fri7);
        this.fri71 = (Button) findViewById(R.id.fri71);
        this.fri72 = (Button) findViewById(R.id.fri72);
        this.fri73 = (Button) findViewById(R.id.fri73);
        this.fri74 = (Button) findViewById(R.id.fri74);
        this.fri75 = (Button) findViewById(R.id.fri75);
        this.z51 = (TextView) findViewById(R.id.frit51);
        this.z52 = (TextView) findViewById(R.id.frit52);
        this.z53 = (TextView) findViewById(R.id.frit53);
        this.z54 = (TextView) findViewById(R.id.frit54);
        this.z55 = (TextView) findViewById(R.id.frit55);
        this.fri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f6 == false) {
                    fri71.setVisibility(View.VISIBLE);
                    fri71.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft51 == false) {
                                z51.setVisibility(View.VISIBLE);
                                ft51 = true;
                            } else {
                                z51.setVisibility(View.GONE);
                                ft51 = false;
                            }
                        }
                    });
                    fri72.setVisibility(View.VISIBLE);
                    fri72.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft52 == false) {
                                z52.setVisibility(View.VISIBLE);
                                ft52 = true;
                            } else {
                                z52.setVisibility(View.GONE);
                                ft52 = false;
                            }
                        }
                    });
                    fri73.setVisibility(View.VISIBLE);
                    fri73.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft53 == false) {
                                z53.setVisibility(View.VISIBLE);
                                ft53 = true;
                            } else {
                                z53.setVisibility(View.GONE);
                                ft53 = false;
                            }
                        }
                    });
                    fri74.setVisibility(View.VISIBLE);
                    fri74.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft54 == false) {
                                z54.setVisibility(View.VISIBLE);
                                ft54 = true;
                            } else {
                                z54.setVisibility(View.GONE);
                                ft54 = false;
                            }
                        }
                    });
                    fri75.setVisibility(View.VISIBLE);
                    fri75.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft55 == false) {
                                z55.setVisibility(View.VISIBLE);
                                ft55 = true;
                            } else {
                                z55.setVisibility(View.GONE);
                                ft55 = false;
                            }
                        }
                    });
                    f6 = true;
                } else {
                    fri71.setVisibility(View.GONE);
                    fri72.setVisibility(View.GONE);
                    fri73.setVisibility(View.GONE);
                    fri74.setVisibility(View.GONE);
                    fri75.setVisibility(View.GONE);
                    z51.setVisibility(View.GONE);
                    z52.setVisibility(View.GONE);
                    z53.setVisibility(View.GONE);
                    z54.setVisibility(View.GONE);
                    z55.setVisibility(View.GONE);
                    f6 = false;
                }
            }
        });
        //<---------------------------------------------FRIDAY #7------------------------------------>
        this.fri8 = (Button) findViewById(R.id.fri8);
        this.fri81 = (Button) findViewById(R.id.fri81);
        this.fri82 = (Button) findViewById(R.id.fri82);
        this.fri83 = (Button) findViewById(R.id.fri83);
        this.fri84 = (Button) findViewById(R.id.fri84);
        this.fri85 = (Button) findViewById(R.id.fri85);
        this.fri86 = (Button) findViewById(R.id.fri86);
        this.z61 = (TextView) findViewById(R.id.frit61);
        this.z62 = (TextView) findViewById(R.id.frit62);
        this.z63 = (TextView) findViewById(R.id.frit63);
        this.z64 = (TextView) findViewById(R.id.frit64);
        this.z65 = (TextView) findViewById(R.id.frit65);
        this.z66 = (TextView) findViewById(R.id.frit66);
        this.fri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f6 == false) {
                    fri81.setVisibility(View.VISIBLE);
                    fri81.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft61 == false) {
                                z61.setVisibility(View.VISIBLE);
                                ft61 = true;
                            } else {
                                z61.setVisibility(View.GONE);
                                ft61 = false;
                            }
                        }
                    });
                    fri82.setVisibility(View.VISIBLE);
                    fri82.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft62 == false) {
                                z62.setVisibility(View.VISIBLE);
                                ft62 = true;
                            } else {
                                z62.setVisibility(View.GONE);
                                ft62 = false;
                            }
                        }
                    });
                    fri83.setVisibility(View.VISIBLE);
                    fri83.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft63 == false) {
                                z63.setVisibility(View.VISIBLE);
                                ft63 = true;
                            } else {
                                z63.setVisibility(View.GONE);
                                ft63 = false;
                            }
                        }
                    });
                    fri84.setVisibility(View.VISIBLE);
                    fri84.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft64 == false) {
                                z64.setVisibility(View.VISIBLE);
                                ft64 = true;
                            } else {
                                z64.setVisibility(View.GONE);
                                ft64 = false;
                            }
                        }
                    });
                    fri85.setVisibility(View.VISIBLE);
                    fri85.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft65 == false) {
                                z65.setVisibility(View.VISIBLE);
                                ft65 = true;
                            } else {
                                z65.setVisibility(View.GONE);
                                ft65 = false;
                            }
                        }
                    });
                    fri86.setVisibility(View.VISIBLE);
                    fri86.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (ft66 == false) {
                                z66.setVisibility(View.VISIBLE);
                                ft66 = true;
                            } else {
                                z66.setVisibility(View.GONE);
                                ft66 = false;
                            }
                        }
                    });
                    f6 = true;
                } else {
                    fri81.setVisibility(View.GONE);
                    fri82.setVisibility(View.GONE);
                    fri83.setVisibility(View.GONE);
                    fri84.setVisibility(View.GONE);
                    fri85.setVisibility(View.GONE);
                    fri86.setVisibility(View.GONE);
                    z61.setVisibility(View.GONE);
                    z62.setVisibility(View.GONE);
                    z63.setVisibility(View.GONE);
                    z64.setVisibility(View.GONE);
                    z65.setVisibility(View.GONE);
                    z66.setVisibility(View.GONE);
                    f6 = false;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btm:
                Intent i = new Intent("com.acilia.barcodeoflife.MAINACTIVITY");
                startActivity(i);
                break;
            case R.id.exit:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }
        return false;
    }

}
