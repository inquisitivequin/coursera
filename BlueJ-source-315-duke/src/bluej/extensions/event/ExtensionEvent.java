/*
 This file is part of the BlueJ program. 
 Copyright (C) 1999-2009  Michael Kolling and John Rosenberg 
 
 This program is free software; you can redistribute it and/or 
 modify it under the terms of the GNU General Public License 
 as published by the Free Software Foundation; either version 2 
 of the License, or (at your option) any later version. 
 
 This program is distributed in the hope that it will be useful, 
 but WITHOUT ANY WARRANTY; without even the implied warranty of 
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 GNU General Public License for more details. 
 
 You should have received a copy of the GNU General Public License 
 along with this program; if not, write to the Free Software 
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA. 
 
 This file is subject to the Classpath exception as provided in the  
 LICENSE.txt file that accompanied this code.
 */
package bluej.extensions.event;

/**
 * Base class for the different event types generated by BlueJ for extensions.
 * 
 * @version $Id: ExtensionEvent.java 6215 2009-03-30 13:28:25Z polle $
 */

 /*
  * Author Damiano Bolla, Universoty of Kent at Canterbury.
  * This is a different one than the previous one done by Clive Miller.
  */
public interface ExtensionEvent 
  {
  /*
   * The issue here is the following. This class is desirable to put all Extensions events under the same ubmbrealla
   * So it is s logical grouper, unfortunately at the moment it cannot be anything else, the reason being
   * 1) The id of each event should be handled in the more dedicated classes (so the id disappear here) since
   *    is has a defined meaning ONLY in the specific implementation.
   * 2) The BPackage is not always present and has a meaning in certain cases (so no point to have it here)
   * 
   * It may be argued that it is nice to have a getEvent at this level, the point is that it WILL return meaningless
   * results if it is not matched with the particular class, it is therefore safere to leave it there.
   * Damiano
   */
  }
