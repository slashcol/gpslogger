/*
*    This file is part of GPSLogger for Android.
*
*    GPSLogger for Android is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 2 of the License, or
*    (at your option) any later version.
*
*    GPSLogger for Android is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with GPSLogger for Android.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.mendhak.gpslogger;


interface IGpsLoggerServiceClient {



    /**
     * Asking the calling activity form to clear itself.
     */
    public void OnStartLogging();

    /**
     * Asking the calling activity form to indicate that logging has stopped
     */
    public void OnStopLogging();

    /**
     * Asking the calling activity form to indicate that an annotation is pending
     */
    public void OnSetAnnotation();

    /**
     * Asking the calling activity form to indicate that no annotation is pending
     */
    public void OnClearAnnotation();


    /**
     * A new current file name is available.
     *
     * @param newFileName
     */
    public void onFileName(String newFileName);


    /**
     * Indicates that the location manager has started waiting for its next location
     */
    public void OnWaitingForLocation(boolean inProgress);


    /**
     * Indicates that location services aren't enabled, so logging will not occur.
     */
    public void OnLocationServicesUnavailable();
}
