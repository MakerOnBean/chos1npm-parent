package cloud.makeronbean.chos1npm.url.servcie.impl;

import cloud.makeronbean.chos1npm.model.pojo.UrlInfo;
import cloud.makeronbean.chos1npm.url.mapper.UrlMapper;
import cloud.makeronbean.chos1npm.url.servcie.UrlService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  23:02
 * @description TODO
 */
@Service
public class UrlServiceImpl extends ServiceImpl<UrlMapper, UrlInfo> implements UrlService {

    /**
     * 根据链接类型获取对应集合
     */
    @Override
    public List<UrlInfo> showAllUrlInfo(Integer urlType) {
        LambdaQueryWrapper<UrlInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UrlInfo::getType,urlType).eq(UrlInfo::getPass,2);
        return this.baseMapper.selectList(wrapper);
    }
}
