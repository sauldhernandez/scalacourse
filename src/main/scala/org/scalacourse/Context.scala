package org.scalacourse

import com.synergygb.zordon.common.data.DataTransformContext
import com.synergygb.zordon.common.process.ProcessContext
import com.synergygb.zordon.common.storage.JsonKeyValueStoreContext
import com.synergygb.zordon.core.Configurable

object Context extends JsonKeyValueStoreContext with DataTransformContext with ProcessContext with Configurable
