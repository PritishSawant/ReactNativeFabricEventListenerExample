package com.myappfabriceg.newarchitecture.components;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class MyButtonClickEvent extends Event<MyButtonClickEvent> {

    public MyButtonClickEvent(int viewId) {
        super(viewId);
    }

    @Override
    public String getEventName() {
        return "onClickHandler";
    }

    @Override
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        super.dispatch(rctEventEmitter);
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), Arguments.createMap());
    }

    @Nullable
    @Override
    protected WritableMap getEventData() {
        return super.getEventData();
    }

//    @Override
//    public short getCoalescingKey() {
//        return 0;
//    }
}