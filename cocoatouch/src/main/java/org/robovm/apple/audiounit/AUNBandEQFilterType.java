/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.audiounit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/AUNBandEQFilterType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Parametric(0L),
    _2ndOrderButterworthLowPass(1L),
    _2ndOrderButterworthHighPass(2L),
    ResonantLowPass(3L),
    ResonantHighPass(4L),
    BandPass(5L),
    BandStop(6L),
    LowShelf(7L),
    HighShelf(8L),
    ResonantLowShelf(9L),
    ResonantHighShelf(10L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AUNBandEQFilterType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AUNBandEQFilterType/*</name>*/ valueOf(long n) {
        for (/*<name>*/AUNBandEQFilterType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AUNBandEQFilterType/*</name>*/.class.getName());
    }
}
