package nurul.id.graphvertexcolouring;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class C3Fragment extends Fragment {
    ImageButton vertex1, vertex2, vertex3;
    String warnaVertex1 = "kuning", warnaVertex2 = "kuning", warnaVertex3 = "kuning";
    TextView txtClick, txtStatus, txtClickLeft;
    int click = 3, jumlahClickV1, jumlahClickV2, jumlahClickV3;

    public C3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c3, container, false);

        vertex1 = (ImageButton) view.findViewById(R.id.Vertex1);
        vertex2 = (ImageButton) view.findViewById(R.id.Vertex2);
        vertex3 = (ImageButton) view.findViewById(R.id.Vertex3);

        txtClick = (TextView) view.findViewById(R.id.max_click);
        txtClickLeft = (TextView) view.findViewById(R.id.click_left);
        txtStatus=(TextView)view.findViewById(R.id.judul);

        vertex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // btnClick(vertex1, warnaVertex1,jumlahClickV1);

                if (click > 0) {
                    jumlahClickV1++;
                    if (jumlahClickV1 % 2 == 1) {
                        if (jumlahClickV1 % 3 == 0) {
                            vertex1.setBackgroundResource(R.drawable.yellow);
                            warnaVertex1 = "kuning";
                        } else {
                            vertex1.setBackgroundResource(R.drawable.blue);
                            warnaVertex1 = "biru";
                        }

                    } else if (jumlahClickV1 % 2 == 0) {
                        if (jumlahClickV1 % 3 == 0) {
                            vertex1.setBackgroundResource(R.drawable.yellow);
                            warnaVertex1 = "kuning";
                        } else {
                            vertex1.setBackgroundResource(R.drawable.red);
                            warnaVertex1 = "merah";
                        }

                    }


                    click--;
                    txtClickLeft.setText(String.valueOf(click).toString());
                    cekGraf();

                }

                System.out.println("warna V1 "+warnaVertex1);
            }
        });

        vertex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //btnClick(vertex2, warnaVertex2,jumlahClickV2);

                if (click > 0) {
                    jumlahClickV2++;
                    if (jumlahClickV2 % 2 == 1) {
                        if (jumlahClickV2 % 3 == 0) {
                            vertex2.setBackgroundResource(R.drawable.yellow);
                            warnaVertex2 = "kuning";
                        } else {
                            vertex2.setBackgroundResource(R.drawable.blue);
                            warnaVertex2 = "biru";
                        }

                    } else if (jumlahClickV2 % 2 == 0) {
                        if (jumlahClickV2 % 3 == 0) {
                            vertex2.setBackgroundResource(R.drawable.yellow);
                            warnaVertex2 = "kuning";
                        } else {
                            vertex2.setBackgroundResource(R.drawable.red);
                            warnaVertex2 = "merah";
                        }

                    }


                    click--;
                    txtClickLeft.setText(String.valueOf(click).toString());
                    cekGraf();

                }

                System.out.println("warna V2 "+warnaVertex2);
            }
        });

        vertex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //btnClick(vertex3, warnaVertex3,jumlahClickV3);

                if (click > 0) {
                    jumlahClickV3++;
                    if (jumlahClickV3 % 2 == 1) {
                        if (jumlahClickV3 % 3 == 0) {
                            vertex3.setBackgroundResource(R.drawable.yellow);
                            warnaVertex3 = "kuning";
                        } else {
                            vertex3.setBackgroundResource(R.drawable.blue);
                            warnaVertex3 = "biru";
                        }

                    } else if (jumlahClickV3 % 2 == 0) {
                        if (jumlahClickV3 % 3 == 0) {
                            vertex3.setBackgroundResource(R.drawable.yellow);
                            warnaVertex3 = "kuning";
                        } else {
                            vertex3.setBackgroundResource(R.drawable.red);
                            warnaVertex3 = "merah";
                        }

                    }


                    click--;
                    txtClickLeft.setText(String.valueOf(click).toString());
                    cekGraf();

                }
                System.out.println("warna V3 "+warnaVertex3);
            }
        });

        txtClickLeft.setText(String.valueOf(click).toString());

        return view;
    }

    public void cekGraf() {
        if (click == 0) {

            if ((
                    warnaVertex1.equalsIgnoreCase("merah") &&
                            warnaVertex2.equalsIgnoreCase("kuning") &&
                            warnaVertex3.equalsIgnoreCase("biru")

            ) ||
                    (
                            warnaVertex1.equalsIgnoreCase("merah") &&
                                    warnaVertex2.equalsIgnoreCase("biru") &&
                                    warnaVertex3.equalsIgnoreCase("kuning")

                    )
                    ||
                    (
                            warnaVertex1.equalsIgnoreCase("kuning") &&
                                    warnaVertex2.equalsIgnoreCase("merah") &&
                                    warnaVertex3.equalsIgnoreCase("biru")

                    )
                    ||
                    (
                            warnaVertex1.equalsIgnoreCase("kuning") &&
                                    warnaVertex2.equalsIgnoreCase("biru") &&
                                    warnaVertex3.equalsIgnoreCase("merah")

                    )
                    ||
                    (
                            warnaVertex1.equalsIgnoreCase("biru") &&
                                    warnaVertex2.equalsIgnoreCase("merah") &&
                                    warnaVertex3.equalsIgnoreCase("kuning")

                    )
                    ||
                    (
                            warnaVertex1.equalsIgnoreCase("biru") &&
                                    warnaVertex2.equalsIgnoreCase("kuning") &&
                                    warnaVertex3.equalsIgnoreCase("merah")

                    )
                    ){
                txtStatus.setText("Awesome");
            }
            else {
                txtStatus.setText("Too much click");
            }


        } /*else {
            txtStatus.setText("Too much click");
        }*/
    }

}
