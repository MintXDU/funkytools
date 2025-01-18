package org.keviin.funkytools.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.keviin.funkytools.mapper.RepositoryMapper;
import org.keviin.funkytools.model.entity.Repository;
import org.springframework.stereotype.Service;

@Service
public class RepositoryService extends ServiceImpl<RepositoryMapper, Repository> {

}
