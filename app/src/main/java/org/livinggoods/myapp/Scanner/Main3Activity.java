package org.livinggoods.myapp.Scanner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import org.livinggoods.myapp.Branches.Kira;
import org.livinggoods.myapp.R;

import java.io.IOException;

import static android.Manifest.permission.CAMERA;

public class Main3Activity extends AppCompatActivity {
    SurfaceView camerapreview;
    String value;
    String TAG;

    TextView txtresult;
    BarcodeDetector barcodeDetector;
    CameraSource cameraSource;
    private static final int requestCameraPermissionId = 201;


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case requestCameraPermissionId: {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.checkSelfPermission(this, CAMERA) != PackageManager.PERMISSION_GRANTED) {

                        return;
                    }
                    try {
                        cameraSource.start(camerapreview.getHolder());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        camerapreview = findViewById(R.id.camerapreview);
        txtresult = findViewById(R.id.txtResult);

        barcodeDetector = new BarcodeDetector.Builder(this)
                .setBarcodeFormats(Barcode.QR_CODE)
                .build();
        cameraSource = new CameraSource
                .Builder(this, barcodeDetector)
                .setRequestedPreviewSize(640, 480)
                .setAutoFocusEnabled(true)
                .build();
        //Add event
        camerapreview.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try{
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), CAMERA) == PackageManager.PERMISSION_GRANTED) {

                    cameraSource.start(camerapreview.getHolder());
                } else {
                    ActivityCompat.requestPermissions(Main3Activity.this, new String[]{CAMERA},
                            requestCameraPermissionId);

                }
                }
                catch (IOException e){
                    e.printStackTrace();
                }


            }

            @Override
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                cameraSource.stop();

            }
        });
        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {

            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {
                final SparseArray<Barcode> qrcodes = detections.getDetectedItems();
                if(qrcodes.size()!=0) {
                    txtresult.post(new Runnable() {
                        @Override
                        public void run() {
                            //create vibration
                            Vibrator vibrator = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                            assert vibrator != null;
                            vibrator.vibrate(100);
                            txtresult.setText(qrcodes.valueAt(0).displayValue);

                            value = txtresult.getText().toString();


                            if (value.equals("")) {
                                Toast.makeText(Main3Activity.this, "No value to be passed", Toast.LENGTH_LONG).show();
                            } else {

                                Intent intent = new Intent(Main3Activity.this,Kira.class);
                                intent.putExtra("value",value);
                                startActivity(intent);


//                                if (getCallingActivity() != null) {
//                                    String clname = getCallingActivity().getClassName();
//
//                                    Log.d("PRINT", clname);
//
//                                    Intent intent = null;
//                                    try {
//                                        intent = new Intent(Main3Activity.this, Class.forName(clname));
//                                        } catch (ClassNotFoundException e) {
//                                            e.printStackTrace();
//                                        }
//
//                                    assert intent != null;
//                                    intent.putExtra("value", value);
//
//                                    startActivity(intent);






                                }







                            }




                    });
                }

            }
        });
    }

}
