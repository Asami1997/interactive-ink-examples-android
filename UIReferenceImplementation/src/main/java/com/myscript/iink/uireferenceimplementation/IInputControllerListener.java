// Copyright MyScript. All rights reserved.

package com.myscript.iink.uireferenceimplementation;

import com.myscript.iink.ContentBlock;

public interface IInputControllerListener
{
  void onDisplayContextMenu(final float x, final float y, final ContentBlock contentBlock, final String[] supportedAddBlockTypes);
}
