/*
 * Copyright (C) 2014 Trillian AB
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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLSessionDownloadDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSURLSessionTaskDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements NSURLSessionDownloadDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("URLSession:downloadTask:didFinishDownloadingToURL:")
    public void URLSession$downloadTask$didFinishDownloadingToURL$(NSURLSession session, NSURLSessionDownloadTask downloadTask, NSURL location) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
    public void URLSession$downloadTask$didWriteData$totalBytesWritten$totalBytesExpectedToWrite$(NSURLSession session, NSURLSessionDownloadTask downloadTask, long bytesWritten, long totalBytesWritten, long totalBytesExpectedToWrite) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
    public void URLSession$downloadTask$didResumeAtOffset$expectedTotalBytes$(NSURLSession session, NSURLSessionDownloadTask downloadTask, long fileOffset, long expectedTotalBytes) { throw new UnsupportedOperationException(); }
    /*</methods>*/
}
