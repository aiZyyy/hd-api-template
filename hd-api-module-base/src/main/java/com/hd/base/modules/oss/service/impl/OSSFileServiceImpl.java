package com.hd.base.modules.oss.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hd.base.modules.oss.entity.OSSFile;
import com.hd.base.modules.oss.mapper.OSSFileMapper;
import com.hd.base.modules.oss.service.IOSSFileService;
import com.hd.common.util.CommonUtils;
import com.hd.common.util.oss.OssBootUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service("ossFileService")
public class OSSFileServiceImpl extends ServiceImpl<OSSFileMapper, OSSFile> implements IOSSFileService {

	@Override
	public void upload(MultipartFile multipartFile) throws IOException {
		String fileName = multipartFile.getOriginalFilename();
		fileName = CommonUtils.getFileName(fileName);
		OSSFile ossFile = new OSSFile();
		ossFile.setFileName(fileName);
		String url = OssBootUtil.upload(multipartFile,"upload/test");
		ossFile.setUrl(url);
		this.save(ossFile);
	}

	@Override
	public boolean delete(OSSFile ossFile) {
		try {
			this.removeById(ossFile.getId());
			OssBootUtil.deleteUrl(ossFile.getUrl());
		}
		catch (Exception ex) {
			return false;
		}
		return true;
	}

}