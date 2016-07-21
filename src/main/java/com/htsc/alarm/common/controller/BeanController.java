package com.htsc.alarm.common.controller;

import com.alibaba.fastjson.JSON;
import com.htsc.alarm.common.bean.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

/**
 * 基础控制器
 * Created by mars_wang on 2016/7/21.
 */
public class BeanController {

        private static final Logger LOG = LoggerFactory.getLogger(BeanController.class);

        protected static HttpHeaders headers = new HttpHeaders();
        static {
            headers.add("Content-Type", "application/json; charset=utf-8");
        }

        protected <T> ResponseEntity<String> returnSuccessMsg(T t){
            Result<T> result = new Result<T>();
            result.setMark("0");
            result.setMessage("SUCCESS");
            result.setData(t);
            return new ResponseEntity<String>(JSON.toJSONString(result), headers, HttpStatus.OK);
        }

        protected <T> ResponseEntity<String> returnSuccessMsg(T t, Long totalCount){
            Result<T> result = new Result<T>();
            result.setMark("0");
            result.setTotalCount(totalCount);
            result.setMessage("SUCCESS");
            result.setData(t);
            return new ResponseEntity<String>(JSON.toJSONString(result), headers, HttpStatus.OK);
        }

        protected ResponseEntity<String> returnNoChangeMsg(String updateTime){
            Result<List<Object>> result = new Result<>();
            result.setMark("2");
            result.setMessage("SUCCESS");
            result.setMessage(updateTime);
            result.setData(null);
            return new ResponseEntity<String>(JSON.toJSONString(result), headers, HttpStatus.OK);
        }

        protected <T> ResponseEntity<String> returnSuccessMsg(T t, String updateTime){
            Result<T> result = new Result<T>();
            result.setMark("0");
            result.setMessage("SUCCESS");
            result.setUpdateTime(updateTime);
            result.setData(t);
            return new ResponseEntity<String>(JSON.toJSONString(result), headers, HttpStatus.OK);
        }

        protected <T> ResponseEntity<String> returnFailMsg(Class<T> c, String msg){
            Result<T> result = new Result<T>();
            result.setMark("1");
            result.setMessage(msg);
            result.setData(null);
            return new ResponseEntity<String>(JSON.toJSONString(result), headers, HttpStatus.OK);
        }

        protected void doBytesResponse(byte[] bytes, HttpServletResponse response){
            OutputStream out = null;
            try {
                out = response.getOutputStream();
                if(bytes != null){
                    out.write(bytes, 0, bytes.length);
                    out.flush();
                }
            } catch (Exception e) {
                LOG.error("{}", e);
            } finally {
                try {
                    if(out != null)
                        out.close();
                } catch (IOException e) {
                    LOG.error("{}", e);
                }
            }
        }

        protected void doStringResponse(String str, HttpServletResponse response){
            PrintWriter out = null;
            try {
                response.setContentType("text/html;charset=UTF-8");
                out = response.getWriter();
                out.println(str);
                out.flush();
            } catch (Exception e) {
                LOG.error("{}", e);
            } finally {
                try {
                    if(out != null)
                        out.close();
                } catch (Exception e) {
                    LOG.error("{}", e);
                }
            }
        }

        protected String getRequestContent(HttpServletRequest request){
            ServletInputStream sis = null;
            try{
                // 取HTTP请求流
                sis = request.getInputStream();
                // 取HTTP请求流长度
                int size = request.getContentLength();
                // 用于缓存每次读取的数据
                byte[] buffer = new byte[size];
                // 用于存放结果的数组
                byte[] reqDataByte = new byte[size];
                int count = 0;
                int readByte = 0;
                // 循环读取
                while (count < size) {
                    // 每次实际读取长度存于readByte中
                    readByte = sis.read(buffer);
                    for(int i=0;i<readByte;i++) {
                        reqDataByte[count + i] = buffer[i];
                    }
                    count += readByte;
                }

                String reqData = new String(reqDataByte, "UTF-8");
                LOG.debug("data = {}", reqData);
                return reqData;
            }catch(Exception e){
                LOG.error("{}", e);
            }finally {
                try {
                    if(sis != null)
                        sis.close();
                } catch (IOException e) {
                    LOG.error("{}", e);
                }
            }
            return null;
        }

        protected void copyPayReqValues(Object concretPayReq, HttpServletRequest request){
            Object payReq = request.getAttribute("configReq");
            if(payReq != null){
                BeanUtils.copyProperties(payReq, concretPayReq);
            }
        }
}



