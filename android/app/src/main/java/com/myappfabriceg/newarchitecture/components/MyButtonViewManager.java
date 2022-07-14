package com.myappfabriceg.newarchitecture.components;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Map;

public class MyButtonViewManager extends SimpleViewManager<MyButtonView> {

    public static final String NAME = "MyButtonView";
    ReactApplicationContext mCallerContext;

    public MyButtonViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }

    @NonNull
    @Override
    protected MyButtonView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new MyButtonView(reactContext);
    }

    @ReactProp(name = "text")
    public void setQrCodeText(MyButtonView view, String text) {
        view.setText(text);
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put(
                "topChange",
                MapBuilder.of(
                        "phasedRegistrationNames",
                        MapBuilder.of("bubbled", "onClickHandler")
                )
        ).build();
    }
}

//  clickHandler?: DirectEventHandler<Event>;