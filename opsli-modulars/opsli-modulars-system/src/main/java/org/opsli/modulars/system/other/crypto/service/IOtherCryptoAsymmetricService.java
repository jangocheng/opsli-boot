/**
* Copyright 2020 OPSLI 快速开发平台 https://www.opsli.com
* <p>
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
* <p>
* http://www.apache.org/licenses/LICENSE-2.0
* <p>
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package org.opsli.modulars.system.other.crypto.service;


import org.opsli.api.wrapper.system.other.crypto.OtherCryptoAsymmetricModel;
import org.opsli.common.enums.CryptoAsymmetricType;
import org.opsli.core.base.service.interfaces.CrudServiceInterface;



import org.opsli.modulars.system.other.crypto.entity.OtherCryptoAsymmetric;


/**
* @BelongsProject: opsli-boot
* @BelongsPackage: org.opsli.modulars.system.other.crypto.service
* @Author: Parker
* @CreateTime: 2021-02-10 17:09:34
* @Description: 非对称加密 Service
*/
public interface IOtherCryptoAsymmetricService extends CrudServiceInterface<OtherCryptoAsymmetric, OtherCryptoAsymmetricModel> {

    /***
     * 重置数据
     * @param type 枚举
     * @return OtherCryptoAsymmetricModel
     */
    OtherCryptoAsymmetricModel reset(CryptoAsymmetricType type);

}
